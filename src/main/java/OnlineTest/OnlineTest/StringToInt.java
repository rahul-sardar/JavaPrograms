package OnlineTest.OnlineTest;

public class StringToInt {

	
	public static void convert(String s) 
	{ 
	      
	    // Initialize a variable 
	    int num = 0; 
	    int n = s.length(); 
	  
	    // Iterate till length of the string 
	    for(int i = 0; i < n; i++) 
	  
	        // Subtract 48 from the current digit 
	        num = num * 10 + ((int)s.charAt(i) - '0'); 
	  
	    // Print the answer 
	    System.out.println(num);
	    System.out.println(num+10);
	} 
	  
	// Driver code 
	public static void main(String[] args) 
	{ 
	    // Given string of number 
	    String s = "123"; 
	  
	    // Function Call 
	    convert(s); 
	} 
}
