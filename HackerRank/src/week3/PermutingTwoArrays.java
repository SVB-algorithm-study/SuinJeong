package week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
	
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	    // Write your code here
		String answer = "true";
	    Collections.sort(A);
	    Collections.sort(B, Collections.reverseOrder());
	    System.out.println(A);
	    System.out.println(B);
	    
	    for(int i = 0; i < A.size(); i++){
	    	if(A.get(i) + B.get(i) >= k) {
	    		continue;
	    	}else answer = "false";
	    }
	    return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 10;
		List<Integer> A = Arrays.asList(1,2,3,4);
		List<Integer> B = Arrays.asList(6,7,8,8);
		
		String answer = twoArrays(k,A,B);
		System.out.println(answer);
	}

}
