package basicjavaprogramming;

import java.util.Scanner;

public class Divisiblecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5");
        }
    }
}
