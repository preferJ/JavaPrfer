package day30_1_memberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepositoey {

	Scanner sc = new Scanner(System.in);
	static List<MemberDTO> memberList = new ArrayList<>();
	Long IDnumber = 1L ;

	void addMember(String id) {
		int duplCheck = 0;
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).memberID)) {
				System.out.println("ID가 중복입니다. 초기 메뉴로 돌아갑니다.");
				duplCheck = 1;
			}
		}
		if (duplCheck == 0) {
			MemberDTO newMember = new MemberDTO();
			newMember.setId(IDnumber);
			newMember.setMemberID(id);
			System.out.print("PW :");
			System.out.println();
			newMember.setMemberPassword(sc.next());
			System.out.print("Name :");
			System.out.println();
			newMember.setMemberName(sc.next());
			System.out.print("Age :");
			System.out.println();
			newMember.setMemberAge(sc.next());
			System.out.print("Mobile :");
			System.out.println();
			newMember.setMemberMobile(sc.next());
			System.out.println("회원가입이 완료됐습니다.");
			memberList.add(newMember);
			System.out.print("회원정보 :");
			System.out.println(memberList.get(IDnumber.intValue()-1));
			IDnumber++;

		}
	}// 회원가입

	public Long login(String id, String pw) {
		int indexNumber = 0;
		int duplChek = -1;
		
		for (int i = 0; i < memberList.size(); i++) {
			if (id.equals(memberList.get(i).memberID)) {
				indexNumber = i;
				duplChek = i;

			}
		}

		if (duplChek == -1) {

			System.out.println("일치하는 ID가 없습니다. 초기화면으로 돌아갑니다.");

		}

		else if (id.equals(memberList.get(indexNumber).memberID) && pw.equals(memberList.get(indexNumber).memberPassword)) {
			System.out.println(memberList.get(indexNumber).memberName + "님 환영합니다.");
		} else if(!pw.equals(memberList.get(indexNumber).memberPassword)){
			System.out.println("패스워드가 일치하지 않습니다. 초기화면으로 돌아갑니다.");
		}

		return memberList.get(indexNumber).id;
	}// 로그인

	void allMember() {
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}// 전체 조회

	void selMember(Long id) {
		int indexNumber = id.intValue();
		System.out.println(memberList.get(indexNumber));
		if (memberList.get(indexNumber) == null) {
			System.out.println("조회결과가 없습니다!!");
		}
	}// 선택 조회

	void editMember(Long id, String editPhoneNember) {
		int indexNumber = id.intValue();
		memberList.get(indexNumber).setMemberMobile(editPhoneNember);
	}// 정보 수정

	void delMember(Long id) {
		int indexNumber = id.intValue();
		System.out.println(memberList.get(indexNumber).getMemberID() + " 회원 삭제가 완료돼었습니다.");
		memberList.remove(indexNumber);

		System.out.println("현재 회원 목록");
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i).memberID);
		}
	}// 멤버 삭제

}// class
