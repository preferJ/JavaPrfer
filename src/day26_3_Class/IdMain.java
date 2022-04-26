package day26_3_Class;
import java.util.Scanner;

public class IdMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ID i1 = new ID("a1","123","preferA","01000000001",20);
		ID i2 = new ID("a2","123","preferB","01000000002",20);
		ID i3 = new ID("a3","123","preferC","01000000003",20);
		ID i4 = new ID("a4","123","preferD","01000000004",20);
		ID i5 = new ID("a5","123","preferE","01000000005",20);
		ID i6 = new ID("a6","123","preferF","01000000006",20);
		ID i7 = new ID("a7","123","preferG","01000000007",20);
		ID i8 = new ID("a8","123","preferH","01000000008",20);
		ID i9 = new ID("a9","123","preferI","01000000009",20);
		
		
		i1.memberLogin("a1", "123");
		i1.memberLogin("a1", "23");
		i1.memberLogin("a4", "23");

		i1.findByid();
		
		i1.update("01098337666");
		
		i1.findByid();
		
		
	}

}
