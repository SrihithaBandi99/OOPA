package basicjavaprogramming;
import java.util.*;
class operands{
	int a;
	int b;
	void setter(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void getter() {
		System.out.println("add : a+b "+ (a+b));
		System.out.println("sub : a-b "+ (a-b));
		System.out.println("divide : a/b "+ (a/b));
		System.out.println("multiplication : a*b "+ (a*b));
		System.out.println("remainder : a%b "+ (a%b));
		
	}
	
	
}

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operands obj = new operands();
		int a;
		int b;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		obj.setter(a,b);
		obj.getter();
		

	}

}
