package week4.PickingNumbers;

import java.util.*;

public class PickingNumbers02 {//예림이 코드를 보고 O(n)으로 풀 수도 있다는걸 알게됨.
	
	public static int pickingNumbers(List<Integer> a) {
	    // Write your code here
	    //Collections.sort(a);  
	    
	    int[] b = new int[100];
	    Arrays.fill(b, 0);
	    
	    for(int c: a) {
	    	b[c] += 1;
	    }
	    //System.out.println(Arrays.toString(b));
	    int max = 0;
	    for(int i = 0; i<b.length-1; i++) {
	    	if(max < b[i] + b[i+1]) max = b[i] + b[i+1];
	    }
		
	    return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(4, 2, 3, 4, 4, 9, 98, 98, 3, 3, 
				3, 4, 2, 98, 1, 98, 98, 1, 1, 4, 
				98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 
				98, 9, 9, 2, 9, 4, 2, 2, 9, 98, 
				4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 
				2, 3, 98, 98, 1, 99, 9, 98, 98, 3, 
				98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 
				9, 2, 4);
		int result = pickingNumbers(a);
		System.out.println(result);
	}

}
