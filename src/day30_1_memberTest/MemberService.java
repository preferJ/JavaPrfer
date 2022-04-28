package day30_1_memberTest;
import java.util.Scanner;

public class MemberService {
Scanner sc = new Scanner(System.in);
//MemberRepositoey mr = new MemberRepositoey();
//MemberService ms = new MemberService();
	
	
public String idInput() {
	MemberRepositoey mr = new MemberRepositoey();
	MemberService ms = new MemberService();
	System.out.print("ID :");
	String id = sc.next();
	return id;
}
public String pwInput() {
	MemberRepositoey mr = new MemberRepositoey();
	MemberService ms = new MemberService();
	System.out.print("PW :");
	String pw = sc.next();
	return pw;
}
	
	
	void addMember() {
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		System.out.println("----------------회원가입----------------");
		String id = idInput();
		mr.addMember(id);
		
	}
	
	Long login() {
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		String id = idInput();
		String pw = pwInput();
		return mr.login(id,pw);
	}
	
	void allMember() {
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		mr.allMember();
	}
	
	void selMember() {
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		System.out.print("조회할 회원의 관리번호를 입력하세요 : ");
		Long id = (long) sc.nextInt();
		mr.selMember(id);
	}
	
	void editMember() {
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		System.out.println("수정할 회원의 ID와 PW를 입력해주세요");
		Long forEditID = ms.login();
		System.out.println("수정 할 전화번호 :");
		String editPhoneNumber = sc.next();
		mr.editMember(forEditID,editPhoneNumber);
		
	}void delMember(){
		MemberRepositoey mr = new MemberRepositoey();
		MemberService ms = new MemberService();
		System.out.println("삭제 할 회원번호 :");
		Long delID = (long) sc.nextInt();
		mr.delMember(delID);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// 클래스 끝
