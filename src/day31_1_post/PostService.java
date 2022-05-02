package day31_1_post;

import java.util.Scanner;

public class PostService {
	PostRepository pr = new PostRepository();
	Scanner sc = new Scanner(System.in);

	void postUp() {
		System.out.print("제목 :");
		String postTitle = sc.next();
		System.out.print("작성자 :");
		String postWriter = sc.next();
		System.out.print("비밀번호 :");
		String postPw = sc.next();
		System.out.print("내용 :");
		String postContents = sc.next();

		pr.postUp(postTitle, postWriter, postPw, postContents);
		System.out.println("글 등록 완료");
	}

	void postList() {
		System.out.println("전체 목록 조회");
		pr.postList();
	}

	void postFind() {
		System.out.println("찾으시는 글 번호 입력");
		int findNum = sc.nextInt();
		pr.postFind(findNum);
	}

	void postEdit() {
		System.out.println("수정할 글 번호 입력");
	int editNum = sc.nextInt();
	System.out.println(editNum + "글의 비밀번호 입력");
	String editPw = sc.next();
	pr.editPost(editNum,editPw);
	
	}
		
	
	
	void postSearch() {
		pr.postSearch();
	}

	
	void postDel() {
		pr.postDel();
	}
	
}
