package day33_2_member_with_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberRepositoey {

	static Map<Long, MemberDTO> memberMap = new HashMap<>();

	boolean idCheck(String memberID) {
		for (Long l : memberMap.keySet()) {
			if (memberID.equals(memberMap.get(l).getMemberID())) {
				return true;
			}
		}

		return false;
	};

	public Long idCheckAndTakeLongId(String memberID) {
		for (Long l : memberMap.keySet()) {
			if (memberID.equals(memberMap.get(l).getMemberID())) {
				return memberMap.get(l).getId();
			}
		}

		return null;
	};


	boolean PWCheck(String memberID, String memberPW) {
		if (memberPW.equals(memberMap.get(idCheckAndTakeLongId(memberID)).getMemberPassword())) {
			return true;
		} else {
			return false;
		}
	};

	boolean numCheck(Long LongID) {
		for (Long l : memberMap.keySet()) {
			if (LongID.equals(memberMap.get(l).getId())) {
				return true;
			}
		}

		return false;
	};

	public String getName(Long longID) {
		// TODO Auto-generated method stub
		return memberMap.get(longID).memberName;
	}

	public MemberDTO getMemberDTO(Long longID) {
		// TODO Auto-generated method stub
		return memberMap.get(longID);
	}

	public String getName(String memberID) {
		// TODO Auto-generated method stub
		Long longID = 0L;
		for (Long l : memberMap.keySet()) {
			if (memberID.equals(memberMap.get(l).memberID)) {
				longID = l;
			}
		}
		return memberMap.get(longID).memberName;
	}

	public void addMerber(Long long1, String memberID, String memberPassword, String memberName, String memberAge,
			String memberMobile) {
		// TODO Auto-generated method stub
		MemberDTO newMember = new MemberDTO(long1, memberID, memberPassword, memberName, memberAge, memberMobile);
		memberMap.put(long1, newMember);
	}

	public void allMember() {
		// TODO Auto-generated method stub
		for (long l : memberMap.keySet()) {
			System.out.println(memberMap.get(l));
		}
	}

	public boolean selMemner(Long longID) {
		return false;
		// TODO Auto-generated method stub

	}

	public void editMember(String memberID, String memberMobile) {
		// TODO Auto-generated method stub
		memberMap.get(idCheckAndTakeLongId(memberID)).setMemberMobile(memberMobile);
	}

	public void delMember(Long longID) {
		// TODO Auto-generated method stub
		memberMap.remove(longID);

	}

}// class