package day30_1_memberTest;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		int controlNumber = 0;
		Scanner sc = new Scanner(System.in);
		MemberService ms = new MemberService();
		MemberDTO m1 = new MemberDTO();

		while (true) {
		System.out.println("------------------ 조작키 입력 -------------------------------------");
		System.out.println("1:회원가입  2:로그인  3:회원목록  4:상세조회  5:회원정보수정  6:회원삭제  7:종료");
		System.out.println("------------------------------------------------------------------");
		controlNumber = sc.nextInt();

		if (controlNumber == 1) {
			ms.addMember();
		}
		if (controlNumber == 2) {
			ms.login();
		}
		if (controlNumber == 3) {
			ms.allMember();
		}
		if (controlNumber == 4) {
			ms.selMember();
		}
		if (controlNumber == 5) {
			ms.editMember();
		}
		if (controlNumber == 6) {
			ms.delMember();
		}
		if (controlNumber == 7) {
	break;
		}

		}

		System.out.println("종료");
	}
	
	
}
