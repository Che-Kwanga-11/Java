/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3_banks;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class HW3_Banks {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        double transaction,balance;
        System.out.println("Enter your current balance(money in your account):");
        balance = kb.nextDouble();
       System.out.println("Enter transaction");
       transaction=kb.nextDouble();
        while(transaction!=0){
            
            balance = balance+transaction;
            System.out.println("|transaction|  balance|");
            System.out.printf("|%11.2f|%9.2f|%n",transaction,balance);
            
            System.out.println("Enter transaction");
            transaction=kb.nextDouble();
        }
 
            if(balance<0){
                System.out.println("You lost money\n Bye");
            }
            else{
                System.out.println("You made money or have the same as when you started");
            }
        }
        
        
// TODO code application logic here
    }
