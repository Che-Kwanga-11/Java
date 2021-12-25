/*
Che Justus Kwanga
This program counts the number of distinct and total vowels in a word.
 */
package hw4_countvowelsonce;

import java.util.Scanner;

public class HW4_CountVowelsOnce {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word, vowels;
        int idx, idx1,totalVowels, distinctVowels, wordLength, vowelsLength;
        vowels = "aeiouy";
        vowelsLength = vowels.length();
        char letter, letter2;
        distinctVowels = 0;
        totalVowels = 0;
        System.out.println("Enter a phrase. I will count the vowels:");
        word = kb.nextLine();
        word = word.toLowerCase();
        wordLength = word.length();
        for (idx = 0; idx < vowelsLength; idx++) {
            letter2 = vowels.charAt(idx);
            idx1 = word.indexOf(letter2);
            if (idx1 > -1) {
                distinctVowels++;
            }

        }

        for (idx = 0; idx < wordLength; idx++) {
            letter = word.charAt(idx);
            idx1 = vowels.indexOf(letter);
            if (idx1 > -1) {
                totalVowels++;
            }

        }
        System.out.printf("There are %d distinct vowels in %s%n", distinctVowels, word);
        System.out.printf("There are %d total vowels in %s%n", totalVowels, word);
    }
}
