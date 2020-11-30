package com.java.ex;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.ex.DB.MemberDao;
import com.java.ex.DB.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberDto dto = null;

		System.out.println("------------");
		System.out.println("1.회원 추가, 2.회원 확인, 3.회원 수정, 4.회원 삭제, 5. 종료");
		System.out.println("------------");
		System.out.print("번호는 ?");

		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();

		if (1 == select) {
			dao.mInsert();
		} else if (2 == select) {
			ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
			dtos = dao.mSelect();
			for (int i = 0; i < dtos.size(); i++) {
				System.out.println("id: " + dtos.get(i).getId());
				System.out.println("pw: " + dtos.get(i).getPw());
				System.out.println("name: " + dtos.get(i).getName());
				System.out.println("email: " + dtos.get(i).getEmail());
				System.out.println("-----------------");
			}
		} else if (3 == select) {
			dao.mUpdate();
		} else if (4 == select) {
			dao.mDelete();
		} else if (5 == select) {
			System.exit(0);
		} else {
			System.out.println("번호를 다시 확인해서 입력해주세요.");

		}

	}
}
