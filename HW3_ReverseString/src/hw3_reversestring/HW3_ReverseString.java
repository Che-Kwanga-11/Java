/*
Che Justus Kwanga 
This program reverses the order of letters in a string given by the user 
 */
package hw3_reversestring;
import java.util.Scanner;

public class HW3_ReverseString {

    
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      String word,newWord;
      newWord="";
      char t;
      int idx,length;
      System.out.println("This program will create a string in reverse order");
      System.out.println("Enter a string:");
      word = kb.nextLine();
      length = word.length();
      for(idx=0;idx<
              length;idx=idx+1)
      {
          
         t=word.charAt(idx);
        newWord=t + newWord;
          
                   
      }
     System.out.printf("The reversed string is: %s%nBye",newWord);
      
    }
    
}
