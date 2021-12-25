/*
Che Justus Kwanga
This program requests a user for two numbers and subtracts according to which value is higher 
 */
package hw3_abs;
import java.util.Scanner;

public class HW3_Abs {

  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);// Scanner is initialized 
        System.out.println("Enter a:");
        double a = kb.nextDouble();// first double is requested from user and stored in variable a 
        System.out.println("Enter b:");
        double b = kb.nextDouble();//second variable is requested and stored in variable b 
        if(a>=b){
            // if a is greater than b then the code is executed in the if path
            double c = a-b;// finds the value c by subtracting b from a 
            System.out.printf("%.2f-%.2f=%.2f%n",a,b,c);// prints out the values and shows the subtraction
            
        }
        else{
            //if b is greater than a then the code is executed in the else path
            double c = b-a;// finds the value c by subtracting a from b 
            System.out.printf("%.2f-%.2f=%.2f%n",b,a,c);// prints out the values
        }
   
    }
    
}
