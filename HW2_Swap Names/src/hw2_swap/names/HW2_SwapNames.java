/*Che Justus Kwanga
 This program swaps two letters positions given the indices by the user
 */
package hw2_swap.names;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class HW2_SwapNames {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = kb.nextLine();
        System.out.println("Enter the first index: ");
        int first = kb.nextInt();
        char cs = word.charAt(first);
        System.out.println("Enter the second index: ");
        int second = kb.nextInt();
        
        char ct = word.charAt(second);
        String words = word.replace(cs,ct);
        ct =word.charAt(second);
        cs = word.charAt(first);
        words = word.replace(ct,cs);
       System.out.println("After Swapping:  "+ words);
        
        // TODO code application logic here
    }
    
}
