package day34_2_interface;

public class ParantClass {
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String name;
	public String address;

	/**
	 * @param name
	 * @param address
	 */
	ParantClass() {
		System.out.println("부모 기본 생성자");
	};

	public ParantClass(String name, String address) {
		System.out.println("부모 매개 생성자");
		this.name = name;
		this.address = address;
	}

	void asd() {
		System.out.println("부모 안녕");
	}
}
