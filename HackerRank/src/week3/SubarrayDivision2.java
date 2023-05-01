package week3;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision2 {
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // Write your code here
		int answer = 0;
		
		for(int i = 0; i< s.size(); i++) {
			int sum = 0;
			for(int j = i; j<i+m; j++) {
				if(i+m <= s.size()) sum += s.get(j);
			}
			if(d==sum) answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s = Arrays.asList(2,2,1,3,2);
		int d = 4;
		int m = 2;
		
		int answer = birthday(s,d,m);
		System.out.println(answer);
	}

}
