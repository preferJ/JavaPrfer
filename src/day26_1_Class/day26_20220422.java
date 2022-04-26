package day26_1_Class;

public class day26_20220422 {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "학생1";
		s1.major = "전자공학";
		s1.studentNumber = "0001";
		s1.age = 21;
		
		Student s2 = new Student("학생2", "전자공학", "0002", 22);

	
	
	Cal c1 = new Cal();
	c1.add1();
	System.out.println(c1.add1());
	
	
	
	System.out.println(c1.add2(10, 30));
	
	c1.add3();
	c1.add4(10,20);
	
	c1.add6("안녕", 10);
	System.out.println(c1.add6("안녕", 10));
	c1.add7(7,3);
	System.out.println(c1.add7(7,3));
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
