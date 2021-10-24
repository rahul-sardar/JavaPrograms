package OnlineTest.OnlineTest;

import java.util.Scanner;

public class isPalindromeNumber {


	public static void main(String[] args) 
	{  
		//Take input from the user
		//Create instance of the Scanner class
		//Checking in a range of number all the palindrome number
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the number: ");  
		int num1=sc.nextInt();
		System.out.println("Enter the number: ");  
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			boolean temp=checkPalindrome(i);
			if(checkPalindrome(i))
				System.out.print(i+" ");
		}

	}
	public static boolean checkPalindrome(int num)
	{
		int r,sum=0;
		int temp=num;
		if ((num >= 0) && (num < 10))
			return true;
		else {

			while(num>0)
			{    
				r=num%10;    
				sum=(sum*10)+r;    
				num=num/10;    
			}    
			if(temp==sum)    
				return true;  
			else    
				return false;
		} 
	}
}
