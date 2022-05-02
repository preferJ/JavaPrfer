package day31_1_post;

import java.util.Scanner;

public class PostMain {
	public static void main(String[] args) {

		PostService ps = new PostService();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int key = 0;

		while (run) {
			System.out.println("	        1. 글작성\r\n"
					+ "	        2. 글목록\r\n"
					+ "	        3. 글조회 \r\n"
					+ "	        4. 글수정\r\n"
					+ "	        5. 글검색\r\n"
					+ "	        6. 글삭제\r\n"
					+ "	        7. 종료");
			key = sc.nextInt();
			switch (key) {
			case 1: {
				ps.postUp();
				break;

			}
			case 2: {
				ps.postList();
				break;

			}
			case 3: {
				ps.postFind();
				break;

			}
			case 4: {
				ps.postEdit();
				break;

			}
			case 5: {
				ps.postSearch();
				break;

			}
			case 6: {
				ps.postDel();
				break;

			}
			case 7: {
				System.out.println("종료");
				break;

			}
			default:
				System.out.println("올바른 조작키를 입력해주세요");
				break;
			}
		}

	}
}