package assignmentPractice;

import java.util.Scanner;


/*
 * WAP to create a class name and prompt user to input values using Scanner class for both the number and
 * print the multiplication of that number passing into a function.
 *
 * The output should be shown in the console like below -
 * Enter the first number - 10
 * Enter the second number - 10
 * Multiplication of first number and second number = 100
 */

public class AcceptInput {


    public static void main(String[] args) {
        AcceptInput acceptInput = new AcceptInput();

        Scanner numInput = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = numInput.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = numInput.nextInt();
        int result = acceptInput.multiply(num1,num2);
        System.out.println("Multiplication of two numbers is "+result);
    }

    public int multiply(int num1,int num2){
        return num1*num2;
    }
}
