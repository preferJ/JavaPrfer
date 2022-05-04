package day34_inheritance;

import java.util.ArrayList;
import java.util.List;

public class InterfaceMain {
	public static void main(String[] args) {
		TestInterface impl1 = new ImplClass1();
		impl1.hello();
		
		impl1 = new ImplClass2();
		impl1.hello();

		
		//ImplClass1의로 개발을 하다가 ImplClass2로 바꿔야 하는 상황
		
//ImplClass1 implc1 = new ImplClass1();	
		
		
		List<String> list1 = new ArrayList<>();



	}
}
