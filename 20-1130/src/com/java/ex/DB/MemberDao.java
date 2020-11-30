package com.java.ex.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDao {
	Connection con = null;
	java.sql.Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement psmt = null;
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://localhost:3307/test";
	static String uid = "root";
	static String pwd = "1234";

	private String query = null;

	// DB�� �����ϱ�
	public void openCon() {
		try {
			Class.forName(driver);
			System.out.println("JDBC ����̹� �ε� ����");
			con = DriverManager.getConnection(url, uid, pwd);
			System.out.println("DB ���� ����");
		} catch (ClassNotFoundException e1) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e2) {
			System.out.println("���� ����");
		}

	}

	// DB ���� ����
	public void closeCon() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (con != null)
				con.close();

			// System.out.println("DB���� ����");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MemberDto> mSelect() {
		query = "select * from member";
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		try {
			openCon();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String id = rs.getString("userID");
				String pw = rs.getString("userPW");
				String name = rs.getString("userName");
				String email = rs.getString("userEmail");

				MemberDto dto = new MemberDto(id, pw, name, email);
				dtos.add(dto);

			}
		} catch (Exception e) {
		} finally {
			closeCon();
		}

		return dtos;
	}

	public void mUpdate() {
		Scanner sc = new Scanner(System.in);
		openCon();
		System.out.print("������ id :");
		String ch_id = sc.next();
		System.out.print("id :");
		String id = sc.next();
		System.out.print("pw :");
		String pw = sc.next();
		System.out.print("name :");
		String name = sc.next();
		System.out.print("email :");
		String email = sc.next();

		query = "update member set userID=?,userPW=?,userName=?,userEmail=? where userID=?";

		try {

			psmt = con.prepareStatement(query);

			MemberDto dto = new MemberDto(id, pw, name, email);
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setEmail(email);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, email);
			psmt.setString(5, ch_id);

			int result = psmt.executeUpdate();
			if (1 == result) {
				System.out.println("ȸ������ ���� ����");
			} else {
				System.out.println("ȸ������ ���� ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon();
			sc.close();
		}
	}

	public void mInsert() {
		openCon();
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("pw : ");
		String pw = sc.next();
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("email : ");
		String email = sc.next();

		MemberDto dto = new MemberDto(id, pw, name, email);

		String query = "select * from member";
		String query2 = "INSERT INTO member VALUES (?,?,?,?) ";

		try {

			psmt = con.prepareStatement(query2);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, email);

			int resultQuery = psmt.executeUpdate();
			if (1 != resultQuery)
				System.out.println("ȸ�� ��� ����");
			else
				System.out.println("ȸ�� ��� ����!");
		} catch (SQLException e2) {
			e2.printStackTrace();
		} catch (Exception e3) {
			e3.printStackTrace();
		} finally {
			closeCon();
			sc.close();
		}
	}

	public void mDelete() {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ȸ���� ���̵� �Է�: ");
		String delid = sc.next();
		query = "delete from member where userID ='" + delid + "'";

		try {
			openCon();
			stmt = con.createStatement();

			int resultQuery = stmt.executeUpdate(query);
			if (1 != resultQuery)
				System.out.println("ȸ�� ���� ����");
			else
				System.out.println("ȸ�� ���� ����");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon();
			sc.close();
		}
	}

}
