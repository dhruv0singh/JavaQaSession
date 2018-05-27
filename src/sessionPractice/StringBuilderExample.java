package sessionPractice;

public class StringBuilderExample {

    public static void main(String args[]) {

        /*String name = "Sri";  //Here it allocates the memory for name variable with Sri
        name = name + "Valli";//Here it again allocates memory for name with SriValli*/

        //To avoid multiple memory allocation we can use String Builder
        StringBuilder sb = new StringBuilder();
        sb.append("Sri");
        sb.append("Valli");
        /*
        *or
        * sb.append("Sri").append("Valli");
        */

        System.out.printf("value is %d ",50);
        System.out.printf("Value in float %f",500.00);
    }

}
