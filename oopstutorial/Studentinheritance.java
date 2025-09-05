package oopstutorial;
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentID;

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}

class GraduateStudent extends Student {
    void submitThesis() {
        System.out.println("Thesis submitted by Graduate Student: " + name);
    }
}
public class Studentinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduateStudent gs = new GraduateStudent();
        gs.name = "Srihitha";
        gs.age = 18;
        gs.studentID = "2420030099";

        gs.displayStudentInfo();  
        gs.submitThesis();        
	}

}
