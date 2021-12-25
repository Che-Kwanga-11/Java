/*
Che Justus Kwanga
This program requests a user for the side length of a rectangle it is to print.
 */
package hw4_rectangles;

import java.util.Scanner;

public class HW4_Rectangles {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int side, count, asterixCounter, asterixCounter2, asterixCounter1;
        String asterix, asterix2;
        asterix = "";
        asterix2 = "";

        System.out.println("This program prints will display a full and empty square");
        System.out.println("Enter the side length:");
        side = kb.nextInt();
        asterixCounter = 0;
        asterixCounter1 = 0;
        asterixCounter2 = 0;
        for (count = 0; count < side; count++) {
            asterix = asterix + "*";

        }

        asterix2 = asterix2 + "*";
        while (asterixCounter1 < (side - 2)) {
            asterix2 = asterix2 + " ";
            asterixCounter1++;
        }
        asterix2 = asterix2 + "*";
        System.out.print(asterix+" ");
        System.out.println(asterix);
        while (asterixCounter < (side - 2)) {
            System.out.print(asterix+" ");
            System.out.println(asterix2);
            asterixCounter++;
        }

        System.out.print(asterix+" ");
        System.out.println(asterix);

    }
}
