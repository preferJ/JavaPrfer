package day30_1_memberTest;

public class MemberDTO {
//    1. 관리번호: id
//    2. 아이디: memberId
//    3. 비밀번호: memberPassword
//    4. 이름: memberName
//    5. 나이: memberAge
//    6. 전화번호: memberMobile
	
	public MemberDTO(Long id, String memberID, String memberPassword, String memberName, String memberAge,
		String memberMobile) {
	super();
	this.id = id;
	this.memberID = memberID;
	this.memberPassword = memberPassword;
	this.memberName = memberName;
	this.memberAge = memberAge;
	this.memberMobile = memberMobile;
}
	
	MemberDTO(){};
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(String memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}


	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", memberID=" + memberID + ", memberPassword=" + memberPassword + ", memberName="
				+ memberName + ", memberAge=" + memberAge + ", memberMobile=" + memberMobile + ", getId()=" + getId()
				+ ", getMemberID()=" + getMemberID() + ", getMemberPassword()=" + getMemberPassword()
				+ ", getMemberName()=" + getMemberName() + ", getMemberAge()=" + getMemberAge() + ", getMemberMobile()="
				+ getMemberMobile() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	Long id;
	String memberID;
	String memberPassword;
	String memberName;
	String memberAge;
	String memberMobile;
	
	

	

}
