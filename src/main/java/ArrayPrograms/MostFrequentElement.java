package ArrayPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MostFrequentElement {
	static void getMostFrequentElement(int inputArray[])
	{
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		//Inserting all the elements of inputArray into elementCountMap
		for (int i : inputArray){
			if (map.containsKey(i)){
				//If an element is present, incrementing its count by 1
				map.put(i, map.get(i)+1);
			}
			else{
				//If an element is not present, put that element with 1 as its value
				map.put(i, 1);
			}
		}
		int element = 0, frequency = 1;

		//Iterating through elementCountMap to get the most frequent element and its frequency
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if(entry.getValue() > frequency){
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}

		//Printing the most frequent element in array and its frequency
		if(frequency > 1){
			System.out.println("Input Array : "+Arrays.toString(inputArray));
			System.out.println("The most frequent element : "+element);
			System.out.println("Its frequency : "+frequency);
			System.out.println("========================");
		}
		else{
			System.out.println("Input Array : "+Arrays.toString(inputArray));
			System.out.println("No frequent element. All elements are unique.");
			System.out.println("=========================");
		}
	}

	public static void main(String[] args){
		getMostFrequentElement(new int[]{4, 5, 8, 7, 4, 7, 6,7});
		getMostFrequentElement(new int[]{5, 4, 8, 7, 4, 7, 6,7,4,4,5,5,5,1,1,1,1});
		getMostFrequentElement(new int[]{1, 2, 7, 5, 3, 6});
	}
}
