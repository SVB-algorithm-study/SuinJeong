package week2;

import java.util.*;

public class CountingSort1 {
	
	public static List<Integer> countingSort(List<Integer> arr) {
	    // Write your code here
	    
		List<Integer> answer = new ArrayList<Integer>(Collections.nCopies(Collections.max(arr)+1, 0));
	    System.out.println(arr);
	    
	    for(Integer i : arr) {
	    	answer.set(i, answer.get(i) + 1);
	    }
	    
	    return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,1,3,2,1));
		
		List<Integer> result = countingSort(arr);
		
		System.out.println(result);

	}

}
