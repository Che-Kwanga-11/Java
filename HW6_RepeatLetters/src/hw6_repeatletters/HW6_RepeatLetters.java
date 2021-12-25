
package hw6_repeatletters;
import java.util.Scanner;

/* Methods:
 A method takes as arguments a string and a number, n, and returns another 
 string where every letter of the word is repeated n times. 

 Another method takes as arguments a string and a number, n, and returns another 
 string where every consonant is repeated n times and every vowel is repeated 2*n
 times. 
 */
/**
 *
 * @author Alexandra Stefan <astefan at uta.edu>
 */
public class HW6_RepeatLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String description = "This program repeatedly reads a word "
                + "and a number, N, and repeats every  letter of the word.\n\n";
        System.out.printf(description);
        System.out.printf("Enter a word, or q to quit: ");
        String text = in.nextLine();
        while (!text.equals("q")) {
            System.out.printf("Enter number of times (must be > 0): ");
            int times = in.nextInt();
            in.nextLine();  // consume the new line character after the number
            // This code does not run now. 
            // You must write the repeatLetters methods. 
            repeatLetters_1(text, times);
            repeatLetters_2(text, times);
            //repeatLetters_3(text, times);   1//uncomment it for the extra work
            System.out.printf("\n\nEnter a word, or q to quit: ");
            text = in.nextLine();
        }
    }

    public static void repeatLetters_1(String text ,int N){
        char s;
        int idx2,idx;
        for(idx=0;idx<text.length();idx++){
            s=text.charAt(idx);
            for(idx2=0;idx2<N;idx2++){
                System.out.print(s);
            }
           
        }
         

    
}
     public static void repeatLetters_2(String text ,int N){
         char s;
         
         String vowels ="aeiouAEIOU";
        int idx2,idx,index;
        System.out.println();
        for(idx=0;idx<text.length();idx++){
            s=text.charAt(idx);
            index = vowels.indexOf(s);
            if(index==-1){
                
            
            for(idx2=0;idx2<N;idx2++){
                System.out.print(s);
            }}
            else{
                for(idx2=0;idx2<(2*N);idx2++){
                System.out.print(s);
            }
            }
        }

     }

// Implement the repeatLetters_1 method here.	
    // Implement the repeatLetters_2 method here.
}
