
package basicjavaprogramming;

import java.util.Scanner;

class Operands {
    int a, b;

    void setter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to print binary of a number
    void printBinary(int n) {
        if (n == 0) {
            System.out.print("0");
            return;
        }

        int[] binary = new int[32];
        int i = 0;

        while (n > 0) {
            binary[i++] = n % 2;
            n = n / 2;
        }

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
    void getter() {
        System.out.print("a in binary: ");
        printBinary(a);
        System.out.println();

        System.out.print("b in binary: ");
        printBinary(b);
        System.out.println();

        System.out.print("a & b: ");
        printBinary(a & b);
        System.out.println();

        System.out.print("a | b: ");
        printBinary(a | b);
        System.out.println();

        System.out.print("a ^ b: ");
        printBinary(a ^ b);
        System.out.println();

        System.out.print("a << b: ");
        printBinary(a << b);
        System.out.println();

        System.out.print("a >> b: ");
        printBinary(a >> b);
        System.out.println();
    }
}

public class Binaryoperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        Operands obj = new Operands();
        obj.setter(a, b);
        obj.getter();
    }
}
