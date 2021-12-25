/*
CHE JUSTUS KWANGA
This Program places queens on a chessBoard basing on which location the user places it and shows its possible moves.
 */
package hw8_placequeens;
import java.util.Scanner;
public class HW8_PlaceQueens {

    public static void main(String[] args) {
        String[][] board;
        System.out.println("q - quit \n" + "r - reset, \n"+ "m - make, \n"+ "a - add queen, \n" + "d - delete queen, \n"+ "c - count queen, \n" + "p - print board");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an option:");
        int s = kb.nextInt();
        board =make(s);
        for(int i=0;i<s;i++){
            
        for(int c =0;c<s;c++){
            
        
        System.out.print(board[i][c]);
        }
        System.out.println();
    }}

     public static String[][] make(int boardSize){
         int number=1;
         String[][] chessBoard= new String[boardSize][boardSize];
         for(int i=0;i<boardSize;i++){
             for(int c = 0; c<boardSize;c++){
              chessBoard[i][c]= " "+number;
              number++;
             }
         number=1;
                 
         }
       
        return chessBoard;
    }

}
