/*CHE JUSTUS KWANGA
 This program prints a face until a user decides to stop.

 */
package hw3_faces;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class HW3_Faces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String YES,right;
        YES = "YES";//variable YES stores string "YES"
        System.out.println("Do you want me to draw a face(yes/no)?");
        right = kb.nextLine();// users input is stored in variable right
        right = right.toUpperCase();// capitalizes user's input to compare to String YES
        while(right.equals(YES))//checks whether users input matches string YES
        {// prints out a face if it matches the string YES
            System.out.println(" -----");
        System.out.println(  "/     \\");
        System.out.println(  "|0   0|");
        System.out.println(  "|  *  |");
        System.out.println(  "\\ \\_/ /");
        System.out.println(" ------");
        System.out.println("Do you want me to draw a face(yes/no)?");
         right = kb.nextLine();
        right = right.toUpperCase();
            
        }
        // once enters anything other than Yes the progam ends 
    }
    
}
