package basicjavaprogramming;
import java.util.Scanner;

class student{
	String name;
	long  rollno;
	int age;
	String gender;
	double percentage;

	
}
public class Formatingwideningnarrowing {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in) ;
   student s = new student();
   System.out.print("Enter name: ");
   s.name= sc.nextLine();
   System.out.print("Enter rollno: ");
   s.rollno= sc.nextLong();
   System.out.print("Enter age: ");
   s.age= sc.nextInt();
// Clear leftover newline
   sc.nextLine();
   System.out.print("Enter gender: ");
   s.gender= sc.nextLine();
   System.out.print("Enter percentage: ");
   s.percentage= sc.nextDouble();
    System.out.println("\n===== Student Details =====");
    System.out.printf("Name       : %-20s\n", s.name);
    System.out.printf("Roll No    : %d\n", s.rollno);
    System.out.printf("Age        : %d\n", s.age);
    System.out.printf("Gender     : %-10s\n", s.gender);
    System.out.printf("Percentage : %.2f%%\n", s.percentage);
    
   int rollnoLong= (int)s.rollno;
   long ageLong=s.age;
   System.out.println("implicit "+ rollnoLong);
   System.out.println("explicit "+ ageLong);
   
	}

}
