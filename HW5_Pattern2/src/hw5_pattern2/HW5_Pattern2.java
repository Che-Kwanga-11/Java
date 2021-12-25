/*
Che Justus Kwanga
 This program prints a pattern given by a program
 */
package hw5_pattern2;
import java.util.Scanner;
public class HW5_Pattern2 {


    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int len,repeat,count,count2,result,lenXlen,result2;
       String pattern ;
       
       System.out.println("This program will print a len X len pattern.");
       System.out.println("Enter len:");
       len=kb.nextInt();
       System.out.println("Enter repeat:");
       repeat = kb.nextInt();
       lenXlen =len*len;
          pattern = "";
          count=1;
          for(count2=0;count2<lenXlen;count2++){
              result = count2%repeat;
              result2 = count%len;
              if(result==0){
                  pattern=pattern +"\\";
              }
              else{
                  pattern = pattern +"-";
                  
              }
              if(count>=1){
              if(result2==0){
                 System.out.println(pattern); 
                 pattern ="";
              }}
               count++;   
              
              
          

      }
        System.out.println("Bye"); 
    }
   
}
    

