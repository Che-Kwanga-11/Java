/*
Che Justus Kwanga
This program asks for a user's name and delivers initials,last and first name in a three column,one row
table.
 */
package hw2_names;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class HW2_Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner che= new Scanner(System.in);
        int idx;
        System.out.println("Please enter your first and last name:");
        String name = che.nextLine();
        idx = name.indexOf(" ");
        
        if(idx== -1){
            System.out.println("Please restart program with a space between your names");
        }
        else{
            String first  = name.substring(0,idx);
            String last = name.substring(idx+1);
            char one = name.charAt(0);
            char two = last.charAt(0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("|%-15s|%-15s|%s.%s|",first,last,one,two);
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           
            
            
        }
        // TODO code application logic here
    }
    
}
