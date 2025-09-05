package basicjavaprogramming;

import java.util.Scanner;

public class ACSIIvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=  new Scanner (System.in);
 String c = sc.next();
 char ch =c.charAt(0);
 System.out.println("character entered " +ch);
 int asciivalue =(int)ch;
 System.out.println("asciivalue of character " +asciivalue);
 
 
 
	}

}
