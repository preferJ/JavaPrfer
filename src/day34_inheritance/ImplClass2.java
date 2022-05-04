package day34_inheritance;

public class ImplClass2 implements TestInterface{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("impClass2's hello");
		
	}

	@Override
	public void hello2(String name) {
		// TODO Auto-generated method stub
		System.out.println("impClass2's hello2 "+name);		
	}

}
