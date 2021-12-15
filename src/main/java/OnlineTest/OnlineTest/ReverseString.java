package OnlineTest.OnlineTest;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hi Rahul", str2 = "Hello  How are you";
		System.out.println(reverse(str));
		System.out.println(reverse2(str2));

	}
	
	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
	
	
	//Without Using String Builder
	public static String reverse2(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		String out="";
		

		//char[] chars = in.toCharArray();

		for (int i = in.length() - 1; i >= 0; i--)
			out= out + in.charAt(i);

		return out;
	}

}
