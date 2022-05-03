package day33_1_Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// key : 정수(int) value : 문자(String)
		//

//		Map<Integer, String> map1 = new HashMap<>();
//
//		map1.put(1, "a");
//		map1.put(1, "b");
//		map1.put(12, "a");
//		map1.put(1, "a");
//		map1.put(1, "b");
//		map1.put(null, "basd");
////		map1.clear();
//		map1.entrySet();
//
//		System.out.println(map1);
//		System.out.println(map1.get(null));
//		System.out.println(map1.size());
//
////		Key = String     value =  String    map2를 선언 하고 데이터 저장 
//
//		Map<String, String> map2 = new HashMap<>();
//
//		map2.put("c", "씨");
//		map2.put("a", "에이");
//		map2.put("b", "비");
//		map2.put("d", "비");
//
//		int asd = 0;
//		System.out.println(map2);
//		map2.keySet();
//		System.out.println(map2.keySet());
//// 반복문에 활용
//		for (String a : map2.keySet()) {
//			System.out.println(a);
//			System.out.println(map2.get(asd));
//		}
//
//		// 삭제
//
//		map2.remove("b");
//		System.out.println(map2.get("b"));
		
		
		
		/*
		 * StudentDTO
		 * 관리번호 이름 전화번호 전공
		 * 
		 * main 메서드에서 studentMap 선언
		 * 반복문으로 출력
		 */
		
		
		StudentDTO s1 = new StudentDTO(1,"1번학생","0001","공대");
		StudentDTO s2 = new StudentDTO(2,"2번학생","0002","상대");
		StudentDTO s3 = new StudentDTO(3,"3번학생","0003","예대");
		
		Map<Integer, StudentDTO> sMap = new HashMap<>();
		
		
		sMap.put(1, s1);
		sMap.put(2, s2);
		sMap.put(3, s3);
		
		
		for(int id :sMap.keySet() ) {
			System.out.println(sMap.get(id));
		}
		
		
		
		
		
		

	}
}
