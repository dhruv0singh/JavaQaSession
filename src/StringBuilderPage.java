import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class StringBuilderPage {

    public static void main(String[] args)
    {
        System.out.println("Please enter first string");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        System.out.println("Please enter second string");
        String str2 = sc.next();

        if(stringCompare(str1,str2))
            System.out.println(str1+" "+str2+" are same");
        else
            System.out.println(str1+" "+str2+" are different");

        System.out.println("Please enter string to check palindrome");
        String str3 = sc.next();
        checkPalindrome(str3);
    }

    public static boolean stringCompare(String str1, String str2)
    {
        System.out.println("In string compare method");
        if(str1.equals(str2))
            return true;

        return false;
    }

    public static void checkPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String revStr = sb.reverse().toString();

        if(str.equals(revStr))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
