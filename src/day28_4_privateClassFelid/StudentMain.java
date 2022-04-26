package day28_4_privateClassFelid;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();

//		getter / setter 적용

		s1.setId(1L);
		s1.setStudentName("학생1");
		System.out.println(s1.getId());

		s2.setId(2);
		s2.setStudentMajor("컴공");
		s2.setStudentName("학생2");
		s2.setStudentNumer("11223344");

		System.out.println(s2.getId());
		System.out.println(s2.getStudentMajor());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentNumer());

//		Student s3 = new Student(2L,"123","학생2","산공"); 
		Student s3 = new Student();
		s3.setId(3);
		s3.setStudentMajor("컴공1");
		s3.setStudentName("학생3");
		s3.setStudentNumer("11223344");

		// Student 객체를 담기 위한 list

		List<Student> sli1 = new ArrayList<>();
		sli1.add(s1);
		sli1.add(s2);
		sli1.add(s3);
		System.out.println(sli1.get(1).getId());

		List<List> i123 = new ArrayList<>();
		i123.add(sli1);


		System.out.println("for 문으로 이름만 출력하기");
		for (Student a : sli1) {
			System.out.println(a.getStudentName());

		}
	}

}
