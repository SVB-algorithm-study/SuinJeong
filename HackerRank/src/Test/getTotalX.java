package Test;

import java.util.*;

public class getTotalX {
	
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
		int result = 0;
		int cnt = 0;
        for(int i = a.get(a.size()-1); i<=b.get(0); i++) {
        	cnt = 0;
        	for(int c: a) {
        		if(i%c == 0) cnt++;
        	}
        	for(int d: b) {
        		if(d%i == 0) cnt++;
        	}
        	if(cnt == a.size() + b.size()) result++;
        }

        return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(3, 4);
		List<Integer> b = Arrays.asList(24, 48);
		
		int result = getTotalX(a,b);
		System.out.println(result);
	}

}
