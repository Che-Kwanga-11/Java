/*

 */
package lecture08;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class Lecture08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int grade,maxCount,count = 0;
       double total;
       System.out.println("Enter grade: ");
       grade = kb.nextInt();
       System.out.println("Enter the number of students in your class:");
       maxCount = kb.nextInt();
       total=0;
       for(count=0;count<maxCount;count++){
        System.out.println("Enter grade");
        grade = kb.nextInt();
        total = total+grade;
    }
       System.out.println(count);
       System.out.println("Average:" +total/grade);
       System.out.println("Bye Bye MF");
       System.out.printf("The total is %5f",total);
       /*while ((grade>=0)&&(grade<=100)&&(count<maxCount)){
           count = count+1;
       if(grade>=60){
           System.out.println("PASS");
       }
       else{
           System.out.println("FAIL");
       }
        System.out.println("Enter grade: ");
       grade = kb.nextInt();
       }
       System.out.println(count);
       System.out.println("Bye");
        // TODO code application logic here
    }*/ 
    }
    
}

