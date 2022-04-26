package day28_3_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Ex01_WrapperClass {
	public static void main(String[] args) {
		// 정수를 담는 list
		// Wrapper Class
		// int - Integer
		// long - long
		// double - Double
		// boolean - Boolean

		// int
		List<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listInt.add(5);
		System.out.println(listInt);
		for (int a : listInt) {
			System.out.println(a);
		}
		
		
	}

}
