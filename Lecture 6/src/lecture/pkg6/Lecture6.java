/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg6;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lecture6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner che= new Scanner(System.in);
        int idx;
        System.out.println("Please enter your first and last name:");
        String name = che.nextLine();
        idx = name.indexOf(" ");
        
        if(idx== -1){
            System.out.println("Please restart program with a space between your names");
        }
        else{
            String first  = name.substring(0,idx);
            String last = name.substring(idx+1);
            char one = name.charAt(0);
            char two = last.charAt(0);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.printf("|%-15s|%-15s|%s.%s|",first,last,one,two);
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           
            
            
        }
        // TODO code application logic here
    }
    
}
