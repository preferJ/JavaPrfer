package day28_1_method;

public class MemberMain {
public static void main(String[] args) {
	
	Member m1 = new Member(1L,"id1","0000","name1","010-1111-1111",11);
	Member m2 = new Member();
	
	m2.id = 2L;
	m2.memberId = "id2";
	m2.memberPassword = "0000";
	m2.memberName ="name2";
	m2.memberPhone ="010-2222-2222";
	m2.memberAge = 22;



	m2.findById();

	
	Post p1 = new Post(1,123,"1번째 글","A","첫 글 입니다.");
	Post p2 = new Post(2,123,"2번째 글","B","두번 글 입니다.");
	

	System.out.println(p1.postNum);
	System.out.println(p2.postNum);

	
	p1.update();
	
	System.out.println(p1.postTitle);
	System.out.println(p1.postMain);

}
}
