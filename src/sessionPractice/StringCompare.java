package sessionPractice;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Scanner;

public class StringCompare {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        StringCompare stringCompare = new StringCompare();

       /* System.out.println("Please enter first string : ");
        String firstString = input.nextLine();

        System.out.println("Please enter Second String : ");
        String secondString = input.nextLine();

        stringCompare.compareBothStrings(firstString,secondString);
        stringCompare.compareIgnoringCase(firstString,secondString);
*/

       System.out.println("Enter string to check polyndrum : ");
       String reverseString = input.nextLine();
       stringCompare.checkDuplicate(reverseString);
       //stringCompare.stringPolyndrum(reverseString);
    }

    public void compareBothStrings(String firstString,String secondString){
        if(firstString.equals(secondString)){
            System.out.println("String match");
        }
        else{
            System.out.println("String doesnt match");
        }
    }

    public void compareIgnoringCase(String firstString,String secondString){
        if(firstString.equalsIgnoreCase(secondString)){
            System.out.println("Strings are Matching");
        }
        else{
            System.out.println("Strings are not Matching");
        }
    }

    public void stringPolyndrum(String str){
        System.out.println(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(str.equals(sb.reverse().toString())){
            System.out.println("String is polindrum ");
        }
        else{
            System.out.println("String is not polindrum");
        }
    }

    public void checkDuplicate(String str){
        for(int i = 0; i<str.length();i++){
            for(int j = i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}
