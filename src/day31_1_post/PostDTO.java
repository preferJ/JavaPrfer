package day31_1_post;

public class PostDTO {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostWriter() {
		return postWriter;
	}
	public void setPostWriter(String postWriter) {
		this.postWriter = postWriter;
	}
	public String getPostPw() {
		return postPw;
	}
	public void setPostPw(String postPw) {
		this.postPw = postPw;
	}
	public String getPostContents() {
		return postContents;
	}
	public void setPostContents(String postContents) {
		this.postContents = postContents;
	}
	public int getPostHits() {
		return postHits;
	}
	public void setPostHits(int postHits) {
		this.postHits = postHits;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	/**
	 * @param id
	 * @param postTitle
	 * @param postWriter
	 * @param postPw
	 * @param postContents
	 * @param postHits
	 * @param postDate
	 */
	public PostDTO(int id, String postTitle, String postWriter, String postPw, String postContents, int postHits,
			String postDate) {
		super();
		this.id = id;
		this.postTitle = postTitle;
		this.postWriter = postWriter;
		this.postPw = postPw;
		this.postContents = postContents;
		this.postHits = postHits;
		this.postDate = postDate;
	}
	
	PostDTO(){}
	
	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", postWriter=" + postWriter + ", postPw=" + postPw
				+ ", postContents=" + postContents + ", postHits=" + postHits + ", postDate=" + postDate + "]";
	}
	int id;
	String postTitle;
	String postWriter;
	String postPw;
	String postContents;
	int postHits;
	String postDate;
	
	//1. 객체지향 프로그래밍 연습(게시판 프로젝트)
	//1. 게시글 정보 
//	    1. 글번호: id
//	    2. 제목: postTitle
//	    3. 작성자: postWriter
//	    4. 비밀번호: postPass
//	    5. 내용: postContents
//	    6. 조회수: postHits
//	    7. 작성시간: postDate
	//2. 주요 기능 
//	    1. 프로그램을 실행하면 아래와 같은 메뉴가 출력되고 각 메뉴의 숫자를 입력하면 해당 기능을 실행할 수 있다. 모든 기능은 처리가 끝난 후 다시 메인 메뉴가 출력되도록 한다. 
//	        1. 글작성
//	        2. 글목록
//	        3. 글조회 
//	        4. 글수정
//	        5. 글검색
//	        6. 글삭제
//	        7. 종료
//	    2. 모든 회원의 데이터는 PostRepository의 postList에 저장되고 관리된다. 
//	        1. postList는 static으로 선언하도록 한다. 
//	    3. 글작성
//	        1. 글작성시 제목, 작성자, 비밀번호, 내용을 입력할 수 있다. 
//	            1. 신규회원정보 입력은 Service Class에서 한다. 
//	        2. 글작성시 관리번호는 자동으로 하나씩 증가되도록 한다. 작성시간도 현재 시간이 입력되도록 한다. 
//	        3. 글작성이 완료되면 “글등록 완료” 라는 내용이 출력되고 메뉴선택창이 출력된다. 
//	    4. 글목록 
//	        1. Service Class 에서 전체 회원의 목록을 출력한다. 
//	    5. 글조회 
//	        1. Service Class 에서 특정 글의 글번호를 입력받고 해당 글의 정보를 출력한다. 
//	        2. 조회 결과가 없으면, “조회결과가 없습니다!!” 출력 
//	    6. 글수정 
//	        1. 글수정은 제목,내용만 하도록 한다. 
//	        2. 글수정 메뉴를 선택하면 Service Class에서 글번호, 비밀번호를 먼저 입력 받고, 두 정보가 모두 일치해야 수정할 제목, 내용을 입력할 수 있다. 
//	        3. 수정이 완료되면 수정완료된 글의 정보를 출력한다. 
//	    7. 글검색 
//	        1. 특정 작성자를 입력하면 입력한 작성자와 일치하는 값을 갖는 글 목록을 출력한다. 
//	            1. ex) 작성자1 이라고 입력하면 작성자1이 작성한 글만 출력(작성자11 또는 작성자123  처럼 작성자 1이 포함된 결과는 따지지 않음)
//	    8. 글삭제 
//	        1. Service Class에서 삭제할 글의 글번호를 입력 받고 해당 글 정보를 삭제하고, 글목록을 출력하여 삭제가 됐는지 확인할 수 있다. 
	//3. Class 구성
//	    1. PostMain Class
//	    2. PostService Class
//	    3. PostRepository Class
//	    4. PostDTO Class


}
