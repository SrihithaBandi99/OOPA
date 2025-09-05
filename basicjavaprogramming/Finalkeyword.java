package basicjavaprogramming;
import java.util.*;

public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
	}

}
