/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg7;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lecture7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* System.out.println("1:" + "hello".equals("hello"));
        System.out.println("11:" + "hello".equals("hello"));
        System.out.println("12:" + "hello".compareTo("hello"));
        System.out.println("13:" + ("hello".compareTo("hello")<0));
        System.out.println("14:" + ("hello".compareTo("21345")<0));
         */
        Scanner kb = new Scanner(System.in);
        int N = 1;
        int x;
        while (N != 0) {
            System.out.print("Enter a number: ");
            x= kb.nextInt();

        }
        System.out.println("This is right after the while loop");

        // TODO code application logic here
    }

}
