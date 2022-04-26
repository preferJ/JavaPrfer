package day26_1_Class;

public class Cal {

	int add1() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;

	}

	int add2(int a, int b) {
		return a + b;
	}

	void add4(int a, int b) {
		System.out.println(a + b);
	}

	void add3() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}

	String add6(String a, int b) {
		System.out.println(b);

		return a + "!!";
	}

	boolean add7 (int a, int b ) {
		if((a+b)>=10) {
			return true ;
		}else {return false;}
	};
	
}
