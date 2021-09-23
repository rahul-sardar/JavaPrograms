package ArrayPrograms;

import java.util.Arrays;

public class findSubArraySum {

	static void findSubArray(int[] inputArray, int inputNumber)
	{
		System.out.println("The array Passed is: "+Arrays.toString(inputArray));
	      System.out.println("sub arrays whose sum is: "+inputNumber);
	      for(int i=0; i<inputArray.length; i++){
	         int sum = 0;
	         for (int j=i; j<inputArray.length; j++){
	            sum = sum + inputArray[j];
	            if(sum == inputNumber){
	               System.out.println(Arrays.toString(Arrays.copyOfRange(inputArray, i, j+1)));
	            }
	         }
	      }
		System.out.println("=================================");
	}

	public static void main(String[] args)
	{
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

		findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

		findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
		
		findSubArray(new int[]{5, 4, 1, 2, 3, 4, 1, 4, 5, 5}, 10);
	}

}
