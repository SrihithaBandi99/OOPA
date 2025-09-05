package tasks;
import java.util.Scanner;
class student{
	String name;
	long rollno;
	int marks;
	void setter(String name,long rollno,int marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	void getter() {
	System.out.println("Name of the student "+ name);
	System.out.println("rollno of the student "+ rollno);
	System.out.println("Marks of the student "+ marks);
	}
}


public class Taskone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Scanner sc = new Scanner(System.in);
student st= new student();
String name = sc.next();
long rollno=sc.nextLong();
int marks=sc.nextInt();
st.setter(name,rollno,marks);
st.getter();
	}

}
