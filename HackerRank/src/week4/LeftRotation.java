package week4;

import java.util.*;

public class LeftRotation {
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    // Write your code here
		Collections.rotate(arr, -d);
	    return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = Arrays.asList(1,2,3,4,5);
		int d = 2;
		List<Integer> result = rotateLeft(d, arr);
		System.out.println(result);
	}

}
