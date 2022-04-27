package day29_1_DTO;

import java.util.ArrayList;
import java.util.List;

public class PhoneMain {
	public static void main(String[] args) {


		PhoneDTO p1 = new PhoneDTO(1L, "아이폰", "123-123", 10000);
		PhoneDTO p2 = new PhoneDTO(2L, "갥럭시", "456-456", 20000);
		
		
		
		//Service 클래스에 phone 객체를 넘김.
		PhoneService psv1 = new PhoneService();
		//Service 클래스가 가지고 있는 save 메서드 호출
		psv1.save(p1);
		psv1.save(p2);
		
		
		psv1.findAll();
	
		PhoneRepository rrr = new PhoneRepository();
		


	}

}
