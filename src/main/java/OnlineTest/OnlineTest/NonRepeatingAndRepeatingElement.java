package OnlineTest.OnlineTest;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatingAndRepeatingElement {

	public static void NonRepeating(int a[],int n)
	{
		int count;
		System.out.println("Non Repeating element in array");

		for(int i=0;i<n;i++)
		{
			count=0;
			//initialise the for loop for checking the elenemnt which are not repeated)
			for (int j = 0; j < n; j++)
			{
				//check the condition if any number is same so
				//incre
				if(a[i]==a[j] && i!=j)
					count++;
			}
			//if count became zero so print the current element
			if(count==0)
				System.out.print(a[i]+" ");
		}
	}
	
	public static void Repeating(int a[],int n)
	{
		int count;
	    Set<Integer> repeatingElement = new HashSet<Integer>();
		System.out.println("Repeating element in array: ");

		for(int i=0;i<n;i++)
		{
			count=0;
			//initialise the for loop for checking the elenemnt which are not repeated)
			for (int j = 0; j < n; j++)
			{
				//check the condition if any number is same so
				//Increment the count if same number found
				if(a[i]==a[j] && i!=j)
					count++;
			}
			//if count became more than '1' so add  the current element in hashset
			if(count>0)
			    repeatingElement.add(a[i]);
		}
		System.out.println(repeatingElement);
	}

	public static void main(String[] args) 
	{
		//        Scanner sc=new Scanner(System.in);
		//        int[] a=new int[50];
		//        System.out.println("enter size of an array");
		//        int size=sc.nextInt();
		//        System.out.println("enter elements of an array");
		//        for(int i=0;i<size;i++)
		//        {
		//             a[i]=sc.nextInt();
		//        }
		//call the NonRepeating function
		int a[] = {1,1,2,3,3,7,9,9}; 
		NonRepeating(a,a.length);
		System.out.println();
		int b[] = {1,1,2,3,3,7,2,9,9,8,6,8}; 
		NonRepeating(b,b.length);
		System.out.println();
		Repeating(b,b.length);
	}

}
