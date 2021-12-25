/*
Che Justus Kwanga
This program calculates the value in the function given between a range given by the user for different values
of x

 */
package hw3_mathfunction;

import java.util.Scanner;

public class HW3_MathFunction {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double A, B, C;
        System.out.println("This program will print the output of the function:");
        System.out.println("9 + (x+3)/2 for A <= x <= B.");//Explains purpose of program to user 
        System.out.println("Enter the value for A:");//Requests for first value from user
        A = kb.nextDouble();
        System.out.println("Enter the value for B:");//Requests second value from user 
        B = kb.nextDouble();
        for (C = 0; A <= B; A = A + 1) {
            C = 9 + (A + 3) / 2;//calculates the function using the input 
            System.out.printf("9+(%.0f+3)/2=%.2f%n", A, C);
        }
        System.out.println("Bye");// Ends execution after exiting loop

    }

}
