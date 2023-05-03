package week3.MaximumPerimeterTriangle;

import java.util.*;

public class MaximumPerimeterTriangle {
	
	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
	    // Write your code here
		List<Integer> result = new ArrayList<>();
		int sum = 0;
		
		Collections.sort(sticks);
		System.out.println(sticks);
		
		for(int i = 0; i<sticks.size()-2; i++) {
			sum = sticks.get(i);
			for(int j = i+1; j<i+2; j++) {
				sum += sticks.get(j);
				if(sum > sticks.get(j+1)) {
					result = Arrays.asList(sticks.get(i), sticks.get(j), sticks.get(j+1));				
				}
			}
		}
		if(result == null) {
			result.add(-1);
		}
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sticks = Arrays.asList(3,9,2,15,3);
		
		List<Integer> result = maximumPerimeterTriangle(sticks);
		System.out.println(result);
	}

}
