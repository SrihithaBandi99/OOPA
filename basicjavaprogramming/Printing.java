package basicjavaprogramming;
import java.util.Scanner;

import  java.lang.Math;
public class Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter your number");
int fact=1;

int n= sc.nextInt();
double sqresult=Math.sqrt(n);
for(int i=1;i<=n;i++) {
fact=fact*i;	
}
System.out.println(fact);
System.out.println(sqresult);
sc.close();
	}

}
