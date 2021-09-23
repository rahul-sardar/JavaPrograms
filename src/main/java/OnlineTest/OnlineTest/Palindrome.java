package OnlineTest.OnlineTest;

public class Palindrome {

	static boolean isPalindrome(String str)
    {
 
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;
 
        // While there are characters to compare
        while (i < j) {
 
            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
 
        // Given string is a palindrome
        return true;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String str = "geeks";
        String str2 = "abba";
 
        if (isPalindrome(str))
            System.out.println("Yes");
        else
            System.out.println("No");
        
        if (isPalindrome(str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
	
}
