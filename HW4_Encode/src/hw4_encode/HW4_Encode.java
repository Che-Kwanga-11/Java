/*
Che Justus Kwanga
This program encodes a string given by a user
 */
package hw4_encode;

import java.util.Scanner;

public class HW4_Encode {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word, encodedWord, alphabet, alphabetEncoded;
        char letter, letter2;
        alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        encodedWord = "";
        alphabetEncoded = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int idx, wordLength, idx2;
        System.out.println("Enter a phrase and I will encode it:");
        word = kb.nextLine();
        wordLength = word.length();
        for (idx = 0; idx < wordLength; idx++) {
            letter = word.charAt(idx);
            idx2 = alphabet.indexOf(letter);
            if (idx2 >-1) {
                letter2 = alphabetEncoded.charAt(idx2);
                encodedWord = encodedWord + letter2;

            } else {
                encodedWord = encodedWord + letter;
            }
        }
        System.out.println(encodedWord);
    }
}
