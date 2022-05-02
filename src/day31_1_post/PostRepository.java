package day31_1_post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostRepository {

	static List<PostDTO> postList = new ArrayList<>();
	static int postNumId = 1;
	Scanner sc = new Scanner(System.in);


	void postUp(String postTitle, String postWriter, String postPw, String postContents) {
		LocalDateTime now = LocalDateTime.now();
		String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		PostDTO newPost = new PostDTO(postNumId, postTitle, postWriter, postPw, postContents, 0, formatedNow);

		postList.add(newPost);
		postNumId++;

	}// postUp

	void postList() {
		for (int i = 0; i < postList.size(); i++) {
			System.out.println(postList.get(i));
		}
	}
	
	public boolean postFind(int findNum) {
		try {
			System.out.println(postList.get(findNum-1));
			int hitUp = postList.get(findNum-1).getPostHits()+1;
			postList.get(findNum-1).setPostHits(hitUp);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("일치하는 글 번호가 없습니다");
			return false;
			
		}
	}

	
	
	void editPost(int num,String Pw) {
		boolean run = true;
		int findNum = num-1;
		if(Pw.equals(postList.get(findNum).postPw)) {
			
		
		
		
		while(run) {
			System.out.println("제목수정 : 1               내용 수정 : 2            모두 수정 : 3");
			int choice = sc.nextInt();
		switch (choice) {
		case 1: {
			System.out.print("현재 제목 : "+postList.get(findNum).postTitle+"      수정 하실 제목 입력 :");
			String editPostTitle = sc.next();
			postList.get(findNum).setPostTitle(editPostTitle);
			run = false;
		break;
		}
		case 2: {
			System.out.print("현재 내용 : "+postList.get(findNum).postContents+"      수정 하실 내용 입력 :");
			String editPostContents = sc.next();
			postList.get(findNum).setPostContents(editPostContents);
			
			run = false;
			break;
		}
		case 3: {
			System.out.print("현재 제목 : "+postList.get(findNum).postTitle+"      수정 하실 제목 입력 :");
			String editPostTitle = sc.next();
			postList.get(findNum).setPostTitle(editPostTitle);
			System.out.print("현재 내용 : "+postList.get(findNum).postContents+"      수정 하실 내용 입력 :");
			String editPostContents = sc.next();
			postList.get(findNum).setPostContents(editPostContents);
			
			run = false;
			break;
		}
		default:
		System.out.println("올바른 수정 키를 입력해주세요");
		}
		}
		}else {
			System.out.println("글 번호와 비밀번호가 일치하지 않습니다.");
		}
	}
	
	
	void postSearch() {
	System.out.println("찾으시는 작성자 입력");
		String findWriter = sc.next();
	try {
		System.out.println(findWriter+"가 작성한 글 목록");
		for(int i = 0 ; i < postList.size() ; i++) {
			if(findWriter.equals(postList.get(i).postWriter)) {
				System.out.println(postList.get(i));
			}
		}
	} catch (Exception e) {
		System.out.println("해당 작성자가 작성한 글이 없습니다.");
	}
	}

	
	
	
	void postDel() {
		try {
			System.out.println("삭제하실 글 번호를 입력해주세요 : ");
			int delNum = sc.nextInt();
			postList.remove(delNum-1);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("삭제 요청하신 글이 존재하지 않습니다.");
		}
	}
	
	
	
}
