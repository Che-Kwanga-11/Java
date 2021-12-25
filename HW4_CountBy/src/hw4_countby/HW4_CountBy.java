/*
Che Justus Kwanga
This program adds an integer to a starting integer until it is equal to or the closet value to the end value
 */
package hw4_countby;

import java.util.Scanner;

public class HW4_CountBy {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int start,step,end,value;
        System.out.println("Enter what you want your start,end and step values to be.");
        System.out.print("Start is:");
        start = kb.nextInt();
        System.out.print("End is:");
        end = kb.nextInt();
        System.out.print("Step is:");
        
        step = kb.nextInt();
        System.out.print("The sequence is:");
        for(value=start;value<=end;value=value+step)
        
        {
        System.out.print(value+" ");
        
            
    }
        System.out.println("");
System.out.println("Bye");
}}
