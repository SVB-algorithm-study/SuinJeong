package week4.PickingNumbers;

import java.util.*;

public class PickingNumbers { //시간 복잡도가 O(n^2)이다. 더 나은 시간복잡도를 위해 02버전으로 한번 더 품.
	
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
