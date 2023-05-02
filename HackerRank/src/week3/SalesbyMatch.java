package week3;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class SalesbyMatch {
	
	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
		Map<Integer,Integer> countMap = new HashMap<>();
		
		for(int num: ar) {
			countMap.put(num, countMap.getOrDefault(num,0) + 1);
		}
		
		int result = 0;
		for(int cnt: countMap.values()) {
			result += cnt/2;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		List<Integer> ar = Arrays.asList(1,2,1,2,3,2,1);
		
		int result = sockMerchant(n,ar);
		System.out.println(result);
	}

}
