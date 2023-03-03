package DataStructure.Linear.Array;

import java.util.Scanner;

public class Matrix {

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
        int[][] B=new int [row][col];
        int[][] C=new int [row][col];

        System.out.println("Enter the element of A:");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print("A["+r+"]"+"["+c+"]= ");
                A[r][c]=input.nextInt();
            }
        }

        System.out.println("Enter the element of B:");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print("A["+r+"]"+"["+c+"]= ");
                B[r][c]=input.nextInt();
            }
        }


        //A+B
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                C[r][c]=A[r][c]+B[r][c];
            }
        }

        System.out.println("A: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(" "+ A[r][c]);
            }
            System.out.println();
        }

        System.out.println("B: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(" "+ B[r][c]);
            }
            System.out.println();
        }

        System.out.println("A+B: ");
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                System.out.print(" "+ C[r][c]);
            }
            System.out.println();
        }
    }

}
