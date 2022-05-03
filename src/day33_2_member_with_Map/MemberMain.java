package day33_2_member_with_Map;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {

		int controlNumber = 0;
		Scanner sc = new Scanner(System.in);
		MemberService ms = new MemberService();
		MemberDTO m1 = new MemberDTO();
		boolean run = true;

		while (run) {
			System.out.println("------------------ 조작키 입력 -------------------------------------");
			System.out.println("1:회원가입  2:로그인  3:회원목록  4:상세조회  5:회원정보수정  6:회원삭제  7:종료");
			System.out.println("------------------------------------------------------------------");
			controlNumber = sc.nextInt();

			switch (controlNumber) {
			case 1: {
				ms.addMember();
				break;

			}
			case 2: {
				ms.login();
				break;

			}
			case 3: {

				ms.allMember();
				break;
			}
			case 4: {

				ms.selMember();
				break;
			}
			case 5: {

				ms.editMember();
				break;
			}
			case 6: {
				ms.delMember();
				break;
			}
			case 7: {
				
				System.out.println("종료");
				run = false;
				break;
			}
			default:
				System.out.println("올바른 키를 입력하세요");
			}

		}

	}

}
