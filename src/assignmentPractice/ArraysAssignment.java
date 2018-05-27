package assignmentPractice;

import java.util.Scanner;

public class ArraysAssignment {



    public static void main(String[] args) {

        ArraysAssignment array = new ArraysAssignment();

        array.printArray();
        //array.sumArray();
        //array.transpose();
    }

    //1.WAP to take a number of rows and column from the user (using scanner class),
    //then populate the 2D array with values and after populating print them all?
    public void printArray(){

        Scanner inputArrayValue = new Scanner(System.in);

        System.out.println("Enter number for rows ");
        int row = inputArrayValue.nextInt();
        System.out.println("Enter value for columns ");
        int col = inputArrayValue.nextInt();
        int[][] arr = new int[row][col];

        System.out.println(arr.length);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter value for ["+i+"]"+"["+j+"]");
                arr[i][j] = inputArrayValue.nextInt();
                //System.out.println("Accepted values "+inputArrayValue.nextInt());
            }
        }

        //Array printing
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    //2.WAP to populate 2D array dynamically and add all elements inside the 2D array?


    //3.WAP to add two 2D arrays and store the result in 3rd 2D Array?
    //A - 1st array, B - 2nd Array, C - Store result of A+B Array in C Array?
    public void sumArray(){

        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] c = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }

        for(int i =0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }
    }

    //4.WAP to populate 2D array or matrix transpose the Matrix
    public void transpose(){

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Before Transpose ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }


        System.out.println("After Transpose ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }


}
