package day33_2_member_with_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberService {
	static Long longID = 1L;

	Scanner sc = new Scanner(System.in);
	MemberRepositoey mr = new MemberRepositoey();

//	Long id;
//	String memberID;
//	String memberPassword;
//	String memberName;
//	String memberAge;
//	String memberMobile;

	void addMember() {
		System.out.println("ID 입력");
		String memberID = sc.next();

		if (mr.idCheck(memberID)) {
			System.out.println("ID 중복입니다.");
		} else {

			System.out.println("PW 입력");
			String memberPassword = sc.next();
			System.out.println("이름 입력");
			String memberName = sc.next();
			System.out.println("나이 입력");
			String memberAge = sc.next();
			System.out.println("번호 입력");
			String memberMobile = sc.next();
			mr.addMerber(longID, memberID, memberPassword, memberName, memberAge, memberMobile);
			System.out.println(mr.getName(longID) + "님 가입을 축하합니다.");
			longID++;
		}

	};

	public boolean login() {
		System.out.println("ID 입력");
		String memberID = sc.next();
		if (mr.idCheck(memberID)) {
			System.out.println("PW 입력");
			String memberPW = sc.next();
			if (mr.PWCheck(memberID,memberPW)) {
				System.out.println(mr.getName(memberID) + "님 환영합니다.");
				return true;
			} else {
				System.out.println("PW가 올바르지 않습니다.");
				return false;
			}
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}

	};

	public boolean login(String memberID) {
		if (mr.idCheck(memberID)) {
			System.out.println("PW 입력");
			String memberPW = sc.next();
			if (mr.PWCheck(memberID,memberPW)) {
				System.out.println(mr.getName(memberID) + "님 환영합니다.");
				return true;
			} else {
				System.out.println("PW가 올바르지 않습니다.");
				return false;
			}
		} else {
			System.out.println("존재하지 않는 ID입니다.");
			return false;
		}

	};

	void allMember() {
		mr.allMember();
	};

	void selMember() {
		System.out.println("찾으시는 회원의 관리 번호를 입력해주세요");
		Long LongID = sc.nextLong();
		if (mr.numCheck(LongID)) {
			System.out.println(mr.getMemberDTO(LongID));
		} else {
			System.out.println("존재하지 않는 회원번호 입니다.");
		}

	};

	void editMember() {
		System.out.println("정보를 수정할 회원의 ID 입력");
		String memberID = sc.next();
		if (login(memberID)) {
			System.out.println("변경 하실 전화번호 입력");
			String memberMobile = sc.next();
			mr.editMember(memberID, memberMobile);
		}
	};

	void delMember() {
		System.out.println("정보를 삭제하실 회원의 관리번호 입력");
		Long LongID = sc.nextLong();
		if (mr.numCheck(LongID)) {
			mr.delMember(LongID);
		} else {
			System.out.println("존재하지 않는 회원번호 입니다.");
		}

	};

}// 클래스 끝
