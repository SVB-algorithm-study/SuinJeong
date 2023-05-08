package week4;

import java.util.*;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
	    // Write your code here
	        Collections.sort(a);
	        int max = 0;
	        
	        for(int i = 0; i<a.size(); i++) {
	        	int cnt = 1;
	        	for(int j = i+1; j<a.size(); j++) {
	        		if(a.get(i) == a.get(j) || a.get(j)-a.get(i)==1) {
	        			cnt++;
	        			continue;
	        		}
	        	}
	        	if(cnt > max) max = cnt;
	        }
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(1,2,2,3,1,2);
		int result = pickingNumbers(a);
		System.out.println(result);
	}

}
