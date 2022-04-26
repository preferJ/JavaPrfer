package day28_4_privateClassFelid;

public class Student {
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentNumer() {
		return studentNumer;
	}

	public void setStudentNumer(String studentNumer) {
		this.studentNumer = studentNumer;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMajor() {
		return studentMajor;
	}

	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

	public Student(long id, String studentNumer, String studentName, String studentMajor) {
		super();
		this.id = id;
		this.studentNumer = studentNumer;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
	}

	Student() {
	};

	private long id;
	private String studentNumer;
	private String studentName;
	private String studentMajor;

}
