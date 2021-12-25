/*
Che Justus Kwanga
This program checks whether the user is of the Astrosign Aries
 */
package aries;

import java.util.Scanner;

public class Aries {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int month, day;// month and day variables initialized as int
        System.out.println("Enter the month:");
        month = kb.nextInt();// user's entry stored in variable month
        System.out.println("Enter the day:");
        day = kb.nextInt();// user's entry stored in variable day 
        if ((month == 3) &&(month == 4))//checks if month is either March or April
        {
            if (month == 3) 
            //if month is March executes code through this path and checks for the day 
            {
                if ((day >= 21) && (day <= 31)) {
                    System.out.println("Aries");
                }//checks if day falls between 21 and 31 and prints Aries if true and Not Aries if false 
                else{
                    System.out.println("Not Aries");
                }
            }
            if (month == 4) //if month is April executes code through this path and checks for the day
            {
                if ((day >= 1) && (day <= 19)) {
                    System.out.println("Aries");
                }//checks if day falls between 1 and 19 and prints Aries if true and Not Aries if false 
                else{
                    System.out.println("Not Aries");
                }
                //
            }
        }
        else{
            System.out.println("Not Aries");// prints out Not Aries automatically if month isnt April or March
        }}}
