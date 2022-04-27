package day29_1_DTO;

public class PhoneDTO {
	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public PhoneDTO(long no, String name, String number, int price) {
		super();
		this.no = no;
		this.name = name;
		this.number = number;
		this.price = price;
	}

	private long no;
	private String name;
	private String number;
	private int price;
	
	PhoneDTO(){};
	
	
	public String toString() {
		return no + name + number + price;
		
	}
	
}
