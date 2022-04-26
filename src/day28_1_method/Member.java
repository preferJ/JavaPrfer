package day28_1_method;

public class Member {
	
	public Member(long id, String memberID, String memberPassword, String memberName, String memberPhone, int age) {
		super();
		this.id = id;
		this.memberId = memberID;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberAge = age;
	}



	long id ;
	String memberId;
	String memberPassword;
	String memberName;
	String memberPhone;
	int memberAge;
	
	
	
	Member(){
		
	}
	
	
	void findById() {
		System.out.println(this.id);
		System.out.println(this.memberId);
	}
	

	

}
