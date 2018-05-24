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

    }

    public static boolean stringCompare(String str1, String str2)
    {
        System.out.println("In compare method");
        if(str1.equals(str2))
            return true;

        return false;
    }
}
