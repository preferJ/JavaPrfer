package day26_2;
import java.util.Scanner;

public class Calculator {
void sum (int a , int b) {
	
	System.out.println(a+b);
}

void sub (int a , int b) {
	System.out.println(a-b);
}

int multi (int a , int b) {
	
	return a* b;
}

int div () {
	Scanner sc = new Scanner(System.in);
	System.out.println("input plz");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	return num1/num2;
}
	
	
	
}
