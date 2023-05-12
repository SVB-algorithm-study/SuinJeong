package week4;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestNumbers {
	
	public static List<Integer> closestNumbers(List<Integer> arr) {
	    // Write your code here
		Collections.sort(arr);
		List<Integer> result = new ArrayList<>();
		int di = arr.get(1)-arr.get(0);
		
		for(int i = 0; i<arr.size()-1; i++) { //가장 작은 차이값을 저장하는 반복문
			if(di > arr.get(i+1)-arr.get(i)) {
				di = arr.get(i+1)-arr.get(i);
			}else continue;
		}
		
		for(int i = 0; i<arr.size()-1; i++) { //가장 작은 차이값을 가진 원소들만을 출력하는 반복문
			if(di == arr.get(i+1)-arr.get(i)) {
				result.add(arr.get(i));
				result.add(arr.get(i+1));
			}
		}
				
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();

        StringTokenizer st;
        try {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int element = Integer.parseInt(st.nextToken());
                arr.add(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
		List<Integer> result = closestNumbers(arr);
		System.out.println(result);
	}

}
