/*Che Justus Kwanga 
 This program modifies a phone number into the format (XXX)XXX-XXXX
when entered by the user in the form XXXXXXXXXX given that ten digits are provided. 
 */
package hw2_phonenumber;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class HW2_PhoneNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner jenny = new Scanner(System.in);
        System.out.println("This program will format a string as a phone number");
        System.out.println("Enter the Number:");
        String number = jenny.nextLine();
        int textLength = number.length();
        if (textLength == 10) {
            String s1 = number.substring(0, 3);
            String s2 = number.substring(3, 6);
            String s3 = number.substring(6, 10);
            System.out.printf("Formatted Number:(%s)%s-%s", s1, s2, s3);
        } else {
            System.out.println("Not a valid number.Please enter another Number:");
            String numbers = jenny.nextLine();
            int textLengt = numbers.length();
            if (textLengt == 10) {
                String s4 = numbers.substring(0, 3);
                String s5 = numbers.substring(3, 6);
                String s6 = numbers.substring(6, 10);
                System.out.printf("Formatted Number:(%s)%s-%s", s4, s5, s6);
            } else {
                System.out.println("\nYou missed your second try!.No more chances!");
            }
        }
        System.out.println("\nBye");
// TODO code application logic here
    }

}
