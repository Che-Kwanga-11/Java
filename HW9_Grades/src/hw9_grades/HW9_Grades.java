/*
Che Justus Kwanga
This program prints the grades of students from a file.
 */
package hw9_grades;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HW9_Grades {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the name of the input file:");
        String inputName = kb.nextLine();
        System.out.println("Please enter the name of the output CSV file");
        String outputName = kb.nextLine();
        System.out.println("Please enter the name of the output pretty name");
        String prettyName = kb.nextLine();
        File f = new File(inputName);
        Scanner inFile = null;
        try {
            inFile = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            System.exit(0);
        }
        ArrayList<String> file = readFile(inFile);
        String[] firstName = new String[file.size()];
        String[] lastName = new String[file.size()];
        double[] hwArray = new double[file.size()];
        double[] examArray = new double[file.size()];
        String[] gradeArray = new String[file.size()];
        double[] lowAverage = new double[file.size()];
        grading(file, firstName, lastName, hwArray, examArray, gradeArray, lowAverage);
        String[] orderGrade = grades(gradeArray, firstName, lastName);
       order(orderGrade);
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
            lastName[i] = words[1];
            int total = 0;
            int count = 0;
            for (int c = 2; c < 5; c++) {
                total = Integer.valueOf(words[c]) + total;
                count++;
            }
            double newTotal = total;
            examArray[i] = (newTotal / count);

            total = 0;
            count = 0;
            for (int c = 5; c < 12; c++) {
                total = Integer.valueOf(words[c]) + total;
                count++;
            }
            newTotal = total;
            hwArray[i] = (newTotal / count);

            if (hwArray[i] > examArray[i]) {
                lowAverage[i] = hwArray[i];

            } else {
                lowAverage[i] = examArray[i];
            }

            if ((lowAverage[i] > 90.00) && (lowAverage[i] <= 100.00)) {
                gradeArray[i] = "A";
            } else if ((lowAverage[i] > 80.00) && (lowAverage[i] <= 89.99)) {
                gradeArray[i] = "B";
            } else if ((lowAverage[i] > 70.00) && (lowAverage[i] <= 79.99)) {
                gradeArray[i] = "C";
            } else if ((lowAverage[i] > 60.00) && (lowAverage[i] <= 69.99)) {
                gradeArray[i] = "D";
            } else if ((lowAverage[i] < 60.00)) {
                gradeArray[i] = "F";
            }

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
        }

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
        }                
        
    }
}
