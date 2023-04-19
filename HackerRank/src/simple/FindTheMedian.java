package simple;

import java.util.*;

public class FindTheMedian {
	
	static int findMedian(List<Integer> arr) {
		int answer;
		
		Collections.sort(arr);
		
		/*if(arr.size() % 2 == 1) {
			answer = arr.get(arr.size()/2);
		}else*/ 
		answer = arr.get(arr.size()/2);
		
		return answer;
	    }

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5,6,0);
		int answer = findMedian(arr);
		System.out.println(answer);
	}

}
