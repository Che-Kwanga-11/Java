
package lecture.pkg12;

import java.util.Scanner;


public class Lecture12 {

   
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String phrase,word,spaces;
        char s;
        spaces =" ";
        word = "";
        
        int idx,index,length,count;
        count=1;
        System.out.println("This program will extract words in a phrase entered by the user.It uses spaces as separator for words (no punctuation or anything else.");
        System.out.println("Enter the phrase:");
        phrase = kb.nextLine();
        length= phrase.length();
        if(length>=1){
        for(idx=0;idx<length;idx++){
            s= phrase.charAt(idx);
            word =  word+s;
            index = word.indexOf(spaces);
            if(index>=0){
                count++;
                System.out.printf("%s%n",word);
                word = "";
            }
        }
        System.out.printf("%s%nThere are %d words in your phrase%n", word,count);
        
    }
        else{
            System.out.println("There are 0 words in your phrase");
        }
}}
        
        
    

