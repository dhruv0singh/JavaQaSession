package assignmentPractice;

import java.util.Scanner;

//WAP to create inner class (Class name - AdditionTwoNumber) and create function
//(Func name - getSum) having two parameters.
//The print sum of both the numbers as result.


public class ClassesAssignment {

    public class AdditionTwoNumber{

        public void getSum(int num1,int num2){
            int result = num1+num2;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        ClassesAssignment classesAssignment = new ClassesAssignment();
        AdditionTwoNumber addition = classesAssignment.new AdditionTwoNumber();

        Scanner inputNum = new Scanner(System.in);

        System.out.println("Enter value for num1 : ");
        int num1 = inputNum.nextInt();
        System.out.println("Enter value for num2 : ");
        int num2 = inputNum.nextInt();
        addition.getSum(num1,num2);

    }

}
