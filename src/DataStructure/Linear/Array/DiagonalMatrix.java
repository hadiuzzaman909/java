package DataStructure.Linear.Array;

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row;
        int col;
        System.out.print("Enter the number of row: ");
        row=input.nextInt();
        System.out.print("Enter the number of column: ");
        col=input.nextInt();
        System.out.println("Row : Column = "+row+ " : "+col);

        int[][] A=new int[row][col];
        int sumOfDiagonalElement=0;
        int sumOfUpperElements=0;
        int sumOfLowerElements=0;


        System.out.println("Enter the element of A:");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print("A["+r+"]"+"["+c+"]= ");
                A[r][c]=input.nextInt();
            }
        }

        System.out.println("A: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(" "+ A[r][c]);
            }
            System.out.println();
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){

                if(r==c){
                    sumOfDiagonalElement=sumOfDiagonalElement+A[r][c];
                }
                if(r<c){
                    sumOfUpperElements=sumOfUpperElements+A[r][c];
                }
                if(r>c){
                    sumOfLowerElements=sumOfLowerElements+A[r][c];
                }
            }
        }
        System.out.println("Sum of Diagonal :"+sumOfDiagonalElement);
        System.out.println("Sum of Upper :"+sumOfUpperElements);
        System.out.println("Sum of Lower :"+sumOfLowerElements);
    }
}
