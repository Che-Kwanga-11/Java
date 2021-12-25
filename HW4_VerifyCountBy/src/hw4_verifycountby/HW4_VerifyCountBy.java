/*
Che Justus Kwanga
This program requests a user for start, stop and stop values and checks if their addition is correct 
*/

package hw4_verifycountby;

import java.util.Scanner;

public class HW4_VerifyCountBy {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int start, step, end, value,answer;
        System.out.println("Enter what you want your start,end and step values to be.");
        System.out.print("Start is:");
        start = kb.nextInt();
        System.out.print("End is:");
        end = kb.nextInt();
        System.out.print("Step is:");

        step = kb.nextInt();
        System.out.println("Enter the numbers starting with 3:");
        for (value = start; value <= end; value = value + step) {
            System.out.println("Enter your answer:");
            answer = kb.nextInt();
            if(answer==value){
                System.out.println("Correct");
               
            }
            else{
                System.out.printf("Wrong.The correct answer is %d%n",value);
            }

        }
        System.out.println("Bye");// TODO code application logic here
    }

}
