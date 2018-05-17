package assignmentPractice;

public class HandlingArrays {

    public static void main(String[] args) {
    HandlingArrays obj = new HandlingArrays();
		/*obj.appendString();
		obj.getIndex();
		obj.stringLength();
		//Arrays
		obj.searchElement();
		obj.arrayReverse();
		obj.findEvenOdd();*/
		obj.findMinMax();


}
    public static void arrayPrint()
    {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(arr.length);

    }


    public static void initiateArray()
    {
        int[] arr = new int[10];
        int sum =0;

        for(int i=0;i<10;i++)
        {
            arr[i] = i+1;
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
    }


    public void appendString()
    {
        String string1 = "Hello";
        String string2 = "World";
        System.out.println("Concatenating string1 and 2 : "+string1+" "+string2);
    }
    public void stringLength()
    {
        String string1 = "Techjini";
        String string2 = "Hello World";

        System.out.println("String1 length : "+string1.length());
        System.out.println("String2 length : "+string2.length());

    }
    public void getIndex()
    {
        String str = "Techjini";
        System.out.println("Index of j is : "+(str.indexOf('j')+1));
    }

    public void arrayReverse()
    {
        int[] arr = {1,2,3,4,5};
        int arrSize = arr.length;
        for(int i = arrSize-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public void findEvenOdd()
    {
        int[] arr = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println(arr[i]+" is even");
            }
            else
            {
                System.out.println(arr[i]+" is odd");
            }
        }
        System.out.println("");
    }
    public void searchElement()
    {
        int[] array = {30,34,56,12,34,55,66,76,54,12};
        int searchNumber = 12;
        for(int i=0;i<array.length;i++)
        {
            if(searchNumber == array[i])
            {
                System.out.println("Search number is found at position : "+(i+1));
                break;
            }
        }
    }

    public void findMinMax()
    {
        int[] array = {30,34,56,12,34,55,66,76,54};
        int max = array[0];
        int min = array[0];

        for(int i=0;i<array.length;i++)
        {
            if(max<array[i])
            {
                max = array[i];
            }
            if(min>array[i])
            {
                min = array[i];
            }
        }

        System.out.println("Maximum value : "+max);
        System.out.println("Minimum value : "+min);
    }


}

