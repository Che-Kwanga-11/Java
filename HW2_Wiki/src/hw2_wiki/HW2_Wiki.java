/*
Che Justus Kwanga
This program prints a topic if the user enters a correct Wikipedia site name 
 */
package hw2_wiki;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class HW2_Wiki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner che = new Scanner(System.in);
        System.out.println("Enter a web address:");
     String ite = che.nextLine();
     int length = ite.length();
     if (length>30){
     String wiki = ite.substring(0,29);
     String topic = ite.substring(29+1);
     String wikiHow = "https://en.wikipedia.org/wiki";
     if (wiki.equals(wikiHow))
     {
         System.out.println("Topic:"+ topic);
         System.out.println("Bye");
         
     }
     else{ 
         System.out.println("Not a valid wikipedia webpage address");
         System.out.println("Bye");
     }
     }else {
         System.out.println("Not a valid wikipedia webpage address");
         System.out.println("Bye");
     }
     }
        // TODO code application logic here
    }
    
