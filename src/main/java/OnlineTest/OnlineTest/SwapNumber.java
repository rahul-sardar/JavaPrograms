 package OnlineTest.OnlineTest;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//swapNumbers(a, b);
		System.out.printf("Before swapping value of a is %d, b is %d", a, b); // a is 10, b is 20
		b = b + a;
		a = b - a;
		b = b - a;
		System.out.printf("\nAfter swapping value of a is %d, b is %d", a, b); // a is 10, b is 20

	}
	public static void swapNumbers(int a, int b) {
	    b = b + a;
		a = b - a;
		b = b - a;
	}


}
