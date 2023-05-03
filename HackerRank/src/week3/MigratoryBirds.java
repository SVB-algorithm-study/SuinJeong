package week3;

import java.util.*;

public class MigratoryBirds {
	
	public static int migratoryBirds(List<Integer> arr) {
	// Write your code here
		int result = 0;
		
		Map<Integer, Integer> countMap = new HashMap<>();
		
		for(int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		int max = 0;
		for(Map.Entry<Integer,Integer> entry : countMap.entrySet()) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				result = entry.getKey();
			}
		}
		
		
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		
		int result = migratoryBirds(arr);
		System.out.println(result);
	}

}
