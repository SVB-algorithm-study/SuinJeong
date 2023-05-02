package week2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
		Integer[] arr = grades.toArray(new Integer[grades.size()]);
		
		for(int i = 0; i<grades.size(); i++) {
			if(arr[i] >= 38) {
				switch(arr[i] % 10) {
					case 3, 8:
						arr[i] += 2;
						break;
					case 4, 9:
						arr[i] += 1;
						break;
				}
			}else;
		}
		return Arrays.asList(arr);
	}

	public static void main(String[] args) {
		/*
		 * Examples
		 * 
		 * round to (85 - 84 is less than 3) do not round (result is less than 40) do
		 * not round (60 - 57 is 3 or higher)
		 */
		List<Integer> grades = new ArrayList<>(Arrays.asList(84, 29, 57));
		List<Integer> answer = gradingStudents(grades);
		System.out.println(grades);
		System.out.println(answer);
	}

}
