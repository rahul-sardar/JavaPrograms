package ArrayPrograms;

import java.util.Arrays;

public class ArrayEqualsSecondMethod {

	
	 public static void main(String[] args)
	    {    
	        int[] arrayOne = {21, 57, 11, 37, 24 , 18 , 9};
	          
	        int[] arrayTwo = {21, 57, 11, 37, 24, 9, 18};
	        
	        String[] arrayString1 = {"Rahul", "Ram"};
	          
	        String[] arrayString2 = {"Rahul", "Ram"};
	          
	        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);
	        boolean equalOrNotString = Arrays.equals(arrayString1, arrayString2);
	        System.out.println("The String Array is equal or not: " +equalOrNotString);
	          
	        System.out.println("Input Arrays :");
	         
	        System.out.println("First Array : "+Arrays.toString(arrayOne));
	         
	        System.out.println("Second Array : "+Arrays.toString(arrayTwo));
	         
	        if (equalOrNot)
	        {
	            System.out.println("Two Arrays Are Equal");
	        }
	        else
	        {
	            System.out.println("Two Arrays Are Not equal");
	        }
	    }
}
