package day34_Exception;

public class ExceptionEx {
	
	
	// 숫자/0 예외처리
	
	
	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 7;
			System.out.println(b/0);
			System.out.println(b/a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나누기 방지");
		}
	}

}
