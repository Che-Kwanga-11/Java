/*

 */
package lecture.pkg09;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class Lecture09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       String word = "",vowels ="";
       int len,i,count;
       count = 0;
       char ch;
       vowels ="aeiouy";
       System.out.println("Enter a word. I will count the vowels:");
       word = kb.nextLine();
       //(vowels.indexOf("u")>=0)
       //word.chartAt(4);
       len = word.length();
       for(i=0;i<len;i=i+1){
           word = word.toLowerCase();
           ch = word.charAt(i);
          
           if(vowels.indexOf(ch)>=0){
              // System.out.println(ch);
              count=count+1;
           }
         
       }
      System.out.printf("There are %d vowels in your \"%s\"%n",count,word);
        // TODO code application logic here
    }
    
}
