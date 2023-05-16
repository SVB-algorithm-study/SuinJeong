package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
	
	public static int minimumAbsoluteDifference(List<Integer> arr) {
	    // Write your code here
		Collections.sort(arr);
		int d = arr.get(1)-arr.get(0); 
		
		for(int i = 0; i<arr.size()-1; i++) {
			if(d > arr.get(i+1)-arr.get(i)) {
				d = arr.get(i+1)-arr.get(i);
			} 
		}
	
	    return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1, -3, 71, 68, 17);
		int result = minimumAbsoluteDifference(arr);
		System.out.println(result);
	}

}
