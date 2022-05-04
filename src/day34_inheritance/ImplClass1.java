package day34_inheritance;

public class ImplClass1 implements TestInterface{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("impClass1's hello");
		
	}

	@Override
	public void hello2(String name) {
		// TODO Auto-generated method stub
		System.out.println("impClass1's hello2 "+name);		
	}

}
