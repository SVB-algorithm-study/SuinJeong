package Test;

import java.util.*;

public class FlippingMatrix {
	
	public static int flippingMatrix(List<List<Integer>> matrix) {
	    // Write your code here
		int sum = 0;
		
		for(int i = 0; i<matrix.size()/2; i++) {
			for(int j = 0; j<matrix.size()/2; j++) {
				int a = matrix.get(i).get(j);
				int b = matrix.get(i).get(matrix.size()-1-j);
				int c = matrix.get(matrix.size()-1-i).get(j);
				int d = matrix.get(matrix.size()-1-i).get(matrix.size()-1-j);
				sum += Math.max(a, Math.max(b, Math.max(c, d)));
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112,42,83,119), Arrays.asList(56,125,56,49), Arrays.asList(15,78,101,43), Arrays.asList(62,98,114,108));
		int result = flippingMatrix(matrix);
		
		System.out.println(result);
	}

}
