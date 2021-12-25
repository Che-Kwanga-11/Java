
package lecture_16;

import java.util.Scanner;

public class Lecture_16 {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("This program will generate all the substrings of a "
                + "given word, in increasing order of substring length.\n");

        System.out.printf("\nPlease enter a word or q to quit: ");
        String userWord = in.nextLine();
        for (; !userWord.equals("q");) {
            printSubstrings(userWord);
            //printSubstringsExtra2(userWord);
            System.out.printf("\n\nPlease enter a word or q to quit: ");
            userWord = in.nextLine();
        }
        System.out.println("\n\nBye\n");
    }
 public static void printSubstrings(String word){
        int length = word.length();
        int idx,idx1,idx2,idx3,count;
        count=0;
        String sub,format,dash;
        dash ="--";
        int space = length+2;
        int count2 = length;
        format ="|%-"+space+"s";
       for(idx=0;idx<count2;idx++){
        for(idx3=0;idx3<space;idx3++){
            dash = dash+"-";
        }
        System.out.print(dash);
        dash ="-";
       }
       System.out.println();
        for(idx2=1;count<length;idx2++){
           for(idx1=0;idx2<=length;idx1++){
            sub = word.substring(idx1,idx2);
            
            System.out.printf(format,sub);
            idx2++;
        }
        count++;
        idx2=count;
        System.out.print("|\n");
        for(idx=0;idx<count2;idx++){
        for(idx3=0;idx3<space;idx3++){
            dash = dash+"-";
        }
        System.out.print(dash);
        dash ="-";
        }
        System.out.println();
        count2--;
        }
        

    }
    // Implement the printSubstrings method here.
}
    
   
