package week3.MaximumPerimeterTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle02 {
	
	public static List<Integer> maximumPerimeterTriangle02(List<Integer> sticks) {
	    // Write your code here
		List<Integer> result = new ArrayList<>();
		int sum = 0;
		
		Collections.sort(sticks);
		System.out.println(sticks);
		
		for(int i = sticks.size()-1; i>1; i--) {
			if(sticks.get(i) < sticks.get(i-1) + sticks.get(i-2)) {
				result = Arrays.asList(sticks.get(i-2), sticks.get(i-1), sticks.get(i));
				break;
			}else result = Arrays.asList(-1);
		}
		
	    return result;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> sticks = Arrays.asList(1,1,1,1,1,2,6,9);
		
		List<Integer> result = maximumPerimeterTriangle02(sticks);
		System.out.println(result);
	}

}
