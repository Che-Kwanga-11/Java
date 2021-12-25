/*
Che Justus Kwanga
This program prints a chart showing 
 */
package hw7_chart;
import java.util.Scanner;

public class HW7_Chart {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int N,idx,largest,i;
        String largestCount="";
        System.out.println("Enter the number of items and their names (N item1 item2 ... itemN):");
        N = kb.nextInt();
        String[] readItems = new String[N];
        for(idx=0;idx<N;idx++){
            readItems[idx]=kb.next();
        }
        System.out.println("Reading the items finished.");
        System.out.println("Enter the data for the counts array in format (N count1 count2 ... countN):");
        N = kb.nextInt();
        int[] readCounts = new int[N];
        for(idx=0;idx<N;idx++){
            readCounts[idx]=kb.nextInt();
        }
        System.out.println("Reading the counts finished.");
        printHorizChart(readCounts,readItems);
        largest = readCounts[0];
        for(idx=1;idx<N;idx++){
            if(readCounts[idx]>largest){
                largest = readCounts[idx];
            }
        }for(i=0;i<N;i++){
        if(readCounts[i]==largest){
            largestCount=readItems[i];
        }}
        System.out.printf("%nItem with largest count:%s%n",largestCount);
        getPercentages(readCounts,readItems);
    }
    public static void printHorizChart(int[] counts,String[] items){
        int idx,idx2,idx3;
        String word,stars;
        stars="";
        for(idx=0;idx<counts.length;idx++){
            idx2 =counts[idx];
            for(idx3=0;idx3<idx2;idx3++){
                stars = stars +"* ";
            }
            word = items[idx];
            System.out.printf("%-10s|%s%n",word,stars);
            stars="";
        }
        String ct = "ct";
        System.out.printf("%-10s|",ct);
        for(idx=1;idx<=100;idx++){
            System.out.printf("%d ",idx);
        }
    }
    public static void getPercentages(int[] counts,String[] items){
        int idx,idx2,idx3,sum_count;
        sum_count=0;
        int[] percent = new int[counts.length];
        for(idx=0;idx<percent.length;idx++){
            percent[idx]=counts[0];
            sum_count= sum_count + percent[idx];
        }
        for(idx=0;idx<percent.length;idx++){
            percent[idx]=((percent[idx]*100)/sum_count);
        }
        String word,stars;
        stars="";
        for(idx=0;idx<percent.length;idx++){
            idx2 =percent[idx];
            for(idx3=0;idx3<idx2;idx3++){
                stars = stars +"* ";
            }
            word = items[idx];
            System.out.printf("%-10s|%s%n",word,stars);
            stars="";
        }
        String ct = "ct";
        System.out.printf("%-10s|",ct);
        for(idx=1;idx<=100;idx++){
            System.out.printf("%d ",idx);
        }
    }

}
