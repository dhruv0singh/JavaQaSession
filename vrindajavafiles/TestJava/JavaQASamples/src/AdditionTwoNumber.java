package TestPackage;

import java.util.Scanner;

public class AdditionTwoNumber {
	
		public static void main(String arng[]){
		Scanner data = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 1st number");
		num1 = data.nextInt();
		System.out.println("Enter 2nd number");
		num2 = data.nextInt();
		sum(num1,num2);

		}
		
		// sum method
public static void sum(int numx, int numy){
	int sum=0;
	sum=numx+numy;
	System.out.println("Sum of 2 number:"+sum);

		}
}
