package week5;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class MissingNumbers {
	
	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
	    // Write your code here
		
		int[] arrList = new int[Collections.max(arr)+1];
		for(int i : arr) {
			arrList[i]++;
		}
		
		int[] brrList = new int[Collections.max(brr)+1];
		for(int i : brr) {
			brrList[i]++;
		}
		
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i<arrList.length; i++) {
			brrList[i] -= arrList[i];
			if(brrList[i] != 0) {
				result.add(i);
			}
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();

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
        
        try {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int element = Integer.parseInt(st.nextToken());
                brr.add(element);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<Integer> result = missingNumbers(arr, brr);
		System.out.println(result);
    }

}
