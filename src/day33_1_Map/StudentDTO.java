package day33_1_Map;

public class StudentDTO {
	/**
	 * @param id
	 * @param name
	 * @param phone
	 * @param major
	 */
	public StudentDTO(int id, String name, String phone, String major) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.major = major;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", major=" + major + "]";
	}
	int id;
	String name;
	String phone;
	String major;

}
