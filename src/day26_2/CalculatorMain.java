package day26_2;
import java.util.Scanner;
public class CalculatorMain {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Calculator cal = new Calculator();
	
	while(true) {
		System.out.println("연산하려는 숫자 입력 (나눗셈은 별도 입력)");
		System.out.print("숫자 1 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 :");
		int num2 = sc.nextInt();
		System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
		int ck = sc.nextInt();
		
		
		if(ck == 1) {
			cal.sum(num1, num2);
		}else if(ck == 2) {
			cal.sub(num1, num2);
		}else if(ck == 3) {
			cal.multi(num1, num2);
		}else if(ck == 4) {
			int result = cal.div();
			System.out.println();
		}else if(ck==5) {
			System.out.println("계산기 종료");
			break;
		}else {
			System.out.println("올바른 조작키를 입력해주세요");
		}
		
	}
	
}
	
}
