package day29_2_DTO2;

public class HumanDTO {
	@Override
	public String toString() {
		return "HumanDTO [id=" + id + ", name=" + name + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]" + "\r\n";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public HumanDTO(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	private long id;
	private String name;
	private int age;
	
	HumanDTO() {
		// TODO Auto-generated constructor stub
	}
	

}
