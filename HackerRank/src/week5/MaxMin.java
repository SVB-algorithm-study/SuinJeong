package week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
	
	public static int maxMin(int k, List<Integer> arr) {
	    // Write your code here
	        Collections.sort(arr);
	        int result = arr.get(k-1)-arr.get(0);
	        for(int i = 0; i<arr.size()-k+1; i++){
	            if(result > arr.get(k-1+i)-arr.get(i)){
	                result = arr.get(k-1+i)-arr.get(i);
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4;
		List<Integer> arr = Arrays.asList(1,2,3,4,10,20,30,40,100,200);
		int result = maxMin(k,arr);
		System.out.println(result);
	}

}
