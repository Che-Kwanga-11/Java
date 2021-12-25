/*
 Che Justus Kwanga
 */
package hw6_vowelcount;

import java.util.Scanner;

public class HW6_VowelCount {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s1,s2;
        int v1,v2;
        System.out.println("Enter a string:");
        s1 = kb.nextLine();
        System.out.println("Enter a string:");
        s2 = kb.nextLine();
        v1 = vowelsCt(s1);
        v2 = vowelsCt(s2);
        System.out.printf("Number of vowels in string %s:%d%n",s1,v1);
        System.out.printf("Number of vowels in string %s:%d%n",s2,v2);
        
    }
public static int vowelsCt(String word){
    word = word.toLowerCase();
    int i,t,count;
    count=0;
    int length = word.length();
    char s;
    String vowels = "aeiou";
     for(i = 0;i <length;i++){
         s = word.charAt(i);
         t = vowels.indexOf(s);
         if((t>=0)&&(t<=4)){
             count++;
         }
     }
     return count;
 }
}
