/*
Che Justus Kwanga
This program prints the grades of students from a file.
 */
package hw9_grades;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.io.PrintWriter;

public class HW9_Grades {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the name of the input file:");// Asks for name of file to be found 
        String inputName = kb.nextLine();
        System.out.print("Please enter the name of the output CSV file:");// Asks for name of first output file
        String outputName = kb.nextLine();
        System.out.print("Please enter the name of the output pretty name:");// Asks for name of organized output file
        String prettyName = kb.nextLine();
        File f = new File(inputName);
        Scanner inFile = null;
        try {
            inFile = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            System.exit(0);
        }// Try-catch statement attempts to open and store file in the scanner
        ArrayList<String> file = readFile(inFile);
        String[] firstName = new String[file.size()];
        String[] lastName = new String[file.size()];
        double[] hwArray = new double[file.size()];
        double[] examArray = new double[file.size()];
        String[] gradeArray = new String[file.size()];
        double[] lowAverage = new double[file.size()];
        grading(file, firstName, lastName, hwArray, examArray, gradeArray, lowAverage);//method extracts the information from file and stores in arrays
        String[] orderGrade = grades(gradeArray, firstName, lastName);// method orders according to letter grade 
       order(orderGrade);
       printOut(outputName,prettyName,examArray,hwArray,gradeArray,firstName,lastName,lowAverage);// prints out the information to two output files
    }

    public static ArrayList<String> readFile(Scanner inFile) {
        ArrayList<String> file = new ArrayList<>();
        for (int i = 0; inFile.hasNextLine(); i++) {
            try {
                file.add(inFile.next());
            } catch (NoSuchElementException n) {
                return file;
            }

        }

        return file;
    }

    public static void grading(ArrayList<String> file, String[] firstName, String[] lastName, double[] hwArray, double[] examArray, String[] gradeArray, double[] lowAverage) {
        for (int i = 1; i < file.size(); i++) {
            String[] words = file.get(i).split(",");
            firstName[i] = words[0];
            lastName[i] = words[1];// stores first name and last name in index 0 and 1
            int total = 0;
            int count = 0;
            for (int c = 2; c < 5; c++) {
                total = Integer.valueOf(words[c]) + total;
                count++;
            }
            double newTotal = total;
            examArray[i] = (newTotal /count);// calculates the average of exam accordingly

            total = 0;
            count = 0;
            for (int c = 5; c < 12; c++) {
                total = Integer.valueOf(words[c]) + total;
                count++;
            }
            newTotal = total;
            hwArray[i] = (newTotal / count);// calculates the average of homework acordingly 

            if (hwArray[i] > examArray[i]) {
                lowAverage[i] = examArray[i];// assigns the lower average to an index in the lowAverage array
               

            } else {
                lowAverage[i] = hwArray[i];// assigns the lower average to an index in the lowAverage array
                
            }
            if ((lowAverage[i] >= 90.00) && (lowAverage[i] <= 100.00)) {
                gradeArray[i] = "A";
            } else if ((lowAverage[i] >= 80.00) && (lowAverage[i] <= 89.99)) {
                gradeArray[i] = "B";
            } else if ((lowAverage[i] >= 70.00) && (lowAverage[i] <= 79.99)) {
                gradeArray[i] = "C";
            } else if ((lowAverage[i] >= 60.00) && (lowAverage[i] <= 69.99)) {
                gradeArray[i] = "D";
            } else if ((lowAverage[i] <= 60.00)) {
                gradeArray[i] = "F";
            }// assigns letter grade basing on the value in the lowAverage array

        }

    }

    public static String[] grades(String[] gradeArray, String[] firstName, String[] lastName) {
        String[] words = new String[gradeArray.length];
        for (int i = 1; i < gradeArray.length; i++) {
            if (gradeArray[i].equals("A")) {
                words[i] = gradeArray[i] + " " + firstName[i] + " " + lastName[i];
            } else if (gradeArray[i].equals("B")) {
                words[i] = gradeArray[i] + " " + firstName[i] + " " + lastName[i];
            } else if (gradeArray[i].equals("C")) {
                words[i] = gradeArray[i] + " " + firstName[i] + " " + lastName[i];
            } else if (gradeArray[i].equals("D")) {
                words[i] = gradeArray[i] + " " + firstName[i] + " " + lastName[i];

            } else if (gradeArray[i].equals("F")) {
                words[i] = gradeArray[i] + " " + firstName[i] + " " + lastName[i];
            }
        }// Organizes the letter grades and their resective names 

        return words;
    }
    public static void order(String[] orderGrade){
         String letterGrade = "ABCDF";
         System.out.println("Sorted by letter grade:");
        for (int i = 1; i < orderGrade.length; i++) {
            char letter = orderGrade[i].charAt(0);
            int index = letterGrade.indexOf(letter);
            if(index==0){
            System.out.println(orderGrade[i]);
            }
        }
                for (int i = 1; i < orderGrade.length; i++) {
            char letter = orderGrade[i].charAt(0);
            int index = letterGrade.indexOf(letter);
            if(index==1){
            System.out.println(orderGrade[i]);
            }
        }
                        for (int i = 1; i < orderGrade.length; i++) {
            char letter = orderGrade[i].charAt(0);
            int index = letterGrade.indexOf(letter);
            if(index==2){
            System.out.println(orderGrade[i]);
            }
        }
                for (int i = 1; i < orderGrade.length; i++) {
            char letter = orderGrade[i].charAt(0);
            int index = letterGrade.indexOf(letter);
            if(index==3){
            System.out.println(orderGrade[i]);
            }
        }
        for (int i = 1; i < orderGrade.length; i++) {
            char letter = orderGrade[i].charAt(0);
            int index = letterGrade.indexOf(letter);
            if(index==4){
            System.out.println(orderGrade[i]);
            }
        }           // sorts the printing by letter grade starting from A     
        
    }
    public static void printOut(String fileName,String prettyName,double[] examArray,double[] hwArray,String[] gradeArray,String[] firstName,String[] lastName,double[] lowAverage){
        
        PrintWriter out = null;
        try{
            out = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Failed to open raw output file");
            System.exit(0);
        }// attempts to open file to write to
        out.println("name,exam score,hw score, min score,grade");// writes to first output file
        for(int i = 1;i<examArray.length;i++){
            out.printf("%s %s,%.6f,%.6f,%.6f,%s%n",firstName[i],lastName[i],examArray[i],hwArray[i],lowAverage[i],gradeArray[i]);
        }
        out.close();// closes writer 
        try{
            out = new PrintWriter(prettyName);
        }
        catch(FileNotFoundException e){
            System.out.println("Failed to open pretty Output file");
                        System.exit(0);
        }
          out.println("                name: exam score, hw score, min score, grade");
         for(int i = 1;i<examArray.length;i++){
             String name = firstName[i]+ " "+lastName[i];
            out.printf("%20s: %10.2f, %8.2f, %9.2f, %s\r\n",name,examArray[i],hwArray[i],lowAverage[i],gradeArray[i]);
        }// writes to second file 
        out.close(); // closes writer
    }
}
