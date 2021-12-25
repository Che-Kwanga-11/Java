/*
Che Justus Kwanga
This program asks a user for their bank account balance and continues querying the user for transactions until the user
enters 0 as an amount
 */
package hw3_banks;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class HW3_Bank {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);//Scanner intitialized
        double transaction,balance;
        System.out.println("Enter your current balance(money in your account):");
        balance = kb.nextDouble();//User's Balance is entered in variable balance in type double
       System.out.println("Enter transaction");
       transaction=kb.nextDouble();//User's first transaction is requested and placed in double variable transaction
        while(transaction!=0){
            //while loop is initialized
            balance = balance+transaction;
            System.out.println("|transaction|  balance|");
            System.out.printf("|%11.2f|%9.2f|%n",transaction,balance);
            //transaction and balance remaining are printed in a neat table
            System.out.println("Enter transaction");
            transaction=kb.nextDouble();// next transaction is requested from user
        }
 
            if(balance<0){
                System.out.println("You lost money\n Bye");//if while loops ends when user enters 0 and the balance is in negatives the message is printed.
            }
            else{
                System.out.println("You made money or have the same as when you started");
            }//if the balance is 0 or greater the above message is printed
        }
        
        
// TODO code application logic here
    }
