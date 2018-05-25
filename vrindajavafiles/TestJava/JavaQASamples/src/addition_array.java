package TestPackage;

public class addition_array {
	

	   public static void main(String[] args) {
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  
		int arr1[][]={{10,20,30},{21,41,51},{42,42,52}};  
		int[][] sum = new int[3][3]; 
		
		
		
	       for (int i = 0; i < 4; i++) {
	           for (int j = 0; j < 5; j++) {
	               sum[i][j] = arr[i][j] + arr1[i][j];
	           }
	       }
	       System.out.println("The sum of the two matrices is");
	       for (int i = 0; i < 4; i++) {
	           for (int j = 0; j < 4; j++) {
	               System.out.print(sum[i][j] + " ");
	           }
	           System.out.println();
	       }
	   }
		
	}
	
	
	


