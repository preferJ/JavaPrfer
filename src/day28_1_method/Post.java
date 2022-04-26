package day28_1_method;

import java.util.Scanner;

public class Post {
	Scanner sc = new Scanner(System.in);
	int postNum;
	int postPw;
	String postTitle;
	String postWriter;
	String postMain;
	int postView;

	public Post(int postNum, int postPw, String postTitle, String postWriter, String postMain) {
		super();
		this.postNum = postNum;
		this.postPw = postPw;
		this.postTitle = postTitle;
		this.postWriter = postWriter;
		this.postMain = postMain;
		this.postView = 0;

	}

	Post() {
	};

	void findByid() {
		this.postView++;
		System.out.println("------------게시글 정보 조회 ----------");
		System.out.println(this.postNum);
		System.out.println(this.postWriter);
		System.out.println(this.postPw);
		System.out.println(this.postTitle);
		System.out.println(this.postMain);
		System.out.println(this.postView);
		System.out.println("-----------------------------------");
	};

	void update() {
		int ret = 1;
		int ed = 0;
		String emain = "";

		while (ret == 1) {
			System.out.print("글 번호 입력");
			int pn = sc.nextInt();
			System.out.print("비밀번호 입력");
			int pw = sc.nextInt();
			if (this.postPw == pw && this.postNum == pn) {
				System.out.println("글 번호와 비밀번호가 일치합니다.");
				System.out.println("------수정하실 항목을 선택해주세요-------");
				System.out.println("-----  1 : 제목    2 : 내용  -------");
				System.out.println("----------------------------------");
				ed = sc.nextInt();
				while (ed != 1 && ed != 2) {
					System.out.println("올바른 조작키를 입력해주세요");
					ed = sc.nextInt();
					if (ed == 1 || ed == 2) {
						break;
					}
				}
			} else {
				System.out.println("글 번호와 비밀번호가 일치하지 않습니다.");
				System.out.println("---------  항목을 선택해주세요  -------");
				System.out.println("-----  1 : 재시도   2 : 종료  -------");
				System.out.println("----------------------------------");
				ret = sc.nextInt();
				while (ret != 1 && ret != 2) {
					System.out.println("올바른 조작키를 입력해주세요");
					ret = sc.nextInt();
					if (ret == 1 || ret == 2) {
						break;
					}
				}

			}

			if (ed == 1) {
				System.out.println("글 제목을 수정합니다.");
				System.out.println("기존제목 : " + this.postTitle);
				System.out.print("변경제목 : ");
				emain = sc.next();
				this.postTitle = emain;
				ret = 2;

			} else if (ed == 2) {
				System.out.println("글 내용을 수정합니다.");
				System.out.println("기존내용 : " + this.postTitle);
				System.out.print("변경내용 : ");
				emain = sc.next();
				this.postMain = emain;
				ret = 2;

			}
		}
		System.out.println();
		System.out.println("수정 기능 종료");

	}
}
