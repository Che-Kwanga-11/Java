/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialcharacters;

import java.util.Scanner;

public class SpecialCharacters {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String special, nonSpecial, newSpecial, word;
        int length, idx, length1, length2, index;
        char s;
        newSpecial = "";
        nonSpecial = "";
        System.out.println("Enter the special characters:");
        special = kb.nextLine();
        System.out.println("Enter the text:");
        word = kb.nextLine();
        length = word.length();
        for (idx = 0; idx < length; idx = idx + 1) {
            s = word.charAt(idx);
            index = special.indexOf(s);
            if (index >= 0) {
                newSpecial = newSpecial + s;
            } else {
                nonSpecial = nonSpecial + s;
            }
        }
        length1 = newSpecial.length();
        length2 = nonSpecial.length();
        System.out.printf("Special:%s%n", newSpecial);
        System.out.printf("Non-Special:%s%n", nonSpecial);
        if (length1 > length2) {
            System.out.println("There are more special characters");
        } else {
            System.out.println("There are more non-special characters");
        }

// TODO code application logic here
    }

}
