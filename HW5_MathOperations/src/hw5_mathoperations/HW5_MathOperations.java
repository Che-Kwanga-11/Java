/*
Che Justus Kwanga
This program operates math functions given by the user 
 */
package hw5_mathoperations;
import java.util.Scanner;

public class HW5_MathOperations {


    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       String operation,symbolString;

       int first,second,result,idx;
       symbolString = "+-/*%";
       System.out.println("Enter the first number:");
       first = kb.nextInt();
       System.out.println("Enter the operation:");
       operation = kb.next();
       System.out.println("Enter the second number:");
       second= kb.nextInt();
       idx = symbolString.indexOf(operation);
        switch (idx) {
            case 0:
                result = first + second;
                System.out.printf("%d%s%d=%d",first,operation,second,result);
                break;
            case 1:
                result = first - second;
                System.out.printf("%d%s%d=%d",first,operation,second,result);
                break;
            case 2:
                result = first/second;
                System.out.printf("%d%s%d=%d",first,operation,second,result);
                break;
            case 3:
                result = first*second;
                System.out.printf("%d%s%d=%d",first,operation,second,result);
                break;
            case 4:
                result = first%second;
                System.out.printf("%d%s%d=%d",first,operation,second,result);
                break;
            default:
                System.out.println("This operation is not recognized");
               
                break;
        }
    }
    
}
