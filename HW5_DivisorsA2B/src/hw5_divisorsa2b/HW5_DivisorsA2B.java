/*
Che Justus Kwanga
This program calculates the divisors for the numbers in a specific range 
 */
package hw5_divisorsa2b;

import java.util.Scanner;

public class HW5_DivisorsA2B {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int A, B, lineLength, count, divisor, result;
        String line, divisorNumber;

        line = "";
        System.out.println("This program will print the divisors of each number in the [A,B].");
        System.out.println("Enter A:");
        A = kb.nextInt();
        System.out.println("Enter B:");
        B = kb.nextInt();
        System.out.println("Enter length of the horizontal line:");
        lineLength = kb.nextInt();

        for (count = 0; count <= lineLength; count++) {
            line = line + "-";
        }
        System.out.println(line);

        for (A = A; A <= B; A++) {
            divisorNumber = "";

            for (divisor = 2; divisor <= B; divisor++) {
                result = A % divisor;
                if (result == 0) {
                    divisorNumber = divisorNumber + divisor + ",";
                }

            }
            System.out.printf("%-2d:%s%n", A, divisorNumber);
            System.out.println(line);
        }
        System.out.println("Bye");
    }

}
