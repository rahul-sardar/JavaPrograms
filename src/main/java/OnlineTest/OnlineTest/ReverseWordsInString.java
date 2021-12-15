package OnlineTest.OnlineTest;

public class ReverseWordsInString {

	public static void main(String[] args) {
		//String s[] = "i      like this program very much".split(" ");
		
		//In Below String we have remove extra spaces from middle, start and end.
		String s[] = "i      like this program very much".replaceAll("\\s+", " ").trim().split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--)
		{
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans);
		System.out.println(ans.substring(0,
				ans.length() - 1));
	}

}


