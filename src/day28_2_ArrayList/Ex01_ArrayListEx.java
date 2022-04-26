package day28_2_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayListEx {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		// 저장
		list1.add("hello1");
		list1.add("hello2");
		list1.add("hello3");
		list1.add("hello4");
		list1.add("hello5");
		list1.add("hello6");
		list1.add(1, "kkkkk");
		list1.add(1, null);
		list1.add(8, null);
		list1.add(3, "null");
		list1.add(3, "");

		System.out.println(list1);
		System.out.println(list1.get(1));

		System.out.println(list1.size());

//		list1.remove(1);
		System.out.println(list1);

		System.out.println("for 문을 사용한 출력 ~~~ ");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

		// for each
		for (Object a : list1) {
			System.out.println(a);
		}
		;

		System.out.println(list1.indexOf(null));
		System.out.println(list1.lastIndexOf(null));
		
		
		
		//정수를 담는 list
		List<Integer> list2 = new ArrayList<>();
		
		
		
		
		
		
	}

}
