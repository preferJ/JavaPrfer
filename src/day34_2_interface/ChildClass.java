package day34_2_interface;

public class ChildClass extends ParantClass{
	
	ChildClass(){
		System.out.println("자식 기본");
	}
	ChildClass(String name ,String adress){
		System.out.println("자식 매개 생성");
		this.name = name ;
		this.address = adress ;
		
	}
	
	public void asd() {
		System.out.println("자식 안녕");
		
	}
	
	
	

	
}
