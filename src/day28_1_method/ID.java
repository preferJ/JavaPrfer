package day28_1_method;

public class ID {
	public ID(String id, String pw, String name, String phone, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public ID() {
	};

	String id;
	String pw;
	String name;
	String phone;
	int age;

	boolean memberLogin(String ckID, String ckPW) {
		if (ckID == this.id && ckPW == this.pw) {
			System.out.println("로그인 성공");
			return true;
		} else if (ckID == this.id) {
			System.out.println("비밀번호가 틀렸습니다.");
			return false;
		} else if (ckID != this.id) {
			System.out.println("존재하지 않는 ID 입니다.");
			return false;
		} else {
			return false;
		}

	}
	
	
	void findByid () {
		System.out.println(this.id);
		System.out.println(this.pw);
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.age);
	}
	
	void update(String p) {
		this.phone = p;
		System.out.println("전화번호가 변경되었습니다.");
	}

}
