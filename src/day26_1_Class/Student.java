package day26_1_Class;

public class Student {
	
	String name;
	String major;
	String studentNumber;
	int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, String major, String studentNumber, int age) {
		super();
		this.name = name;
		this.major = major;
		this.studentNumber = studentNumber;
		this.age = age;
	}

	Student() {

	}

}
