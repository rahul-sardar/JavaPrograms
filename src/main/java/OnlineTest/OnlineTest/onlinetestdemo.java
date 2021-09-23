package OnlineTest.OnlineTest;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class onlinetestdemo {

	public static void main(String[] args) {
		int [] given = {1,2,3,1,2,6,8};
		Arrays.sort(given);
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		for(int a : given) {
			set.add(a);		
		}
		System.out.println(set);
		
	}

}
