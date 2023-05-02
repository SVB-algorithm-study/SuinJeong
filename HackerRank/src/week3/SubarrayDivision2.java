package week3;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision2 {
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
	    int cnt = 0, sum;
	    for(int i = 0; i<=s.size()-m; i++) {
	    	sum = 0;
	    	for(int j = i; j<i+m; j++) {
	    		sum += s.get(j);
	    	}
	    	if(sum == d) {
	    		cnt++;
	    	}
	    }
	    return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
		int d = 3;
		int m = 2;
		
		int answer = birthday(s,d,m);
		System.out.println(answer);
	}

}
