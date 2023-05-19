package Test;

import java.util.Arrays;
import java.util.List;

public class Anagram {
	
	public static int anagram(String s) {
	    // Write your code here	
		if(s.length()%2 > 0) return -1;
		
		char[] substr1 = s.substring(0,s.length()/2).toCharArray();
		char[] substr2 = s.substring(s.length()/2, s.length()).toCharArray();
		int[] num1 = new int[26];
		int[] num2 = new int[26];
		
		for(int i = 0; i<s.length()/2; i++) {
			num1[(char)(substr1[i]-97)] += 1;
			num2[(char)(substr2[i]-97)] += 1;
		}
		
		int cnt = 0;
		for(int i = 0; i<26; i++) {
			if(num1[i] != num2[i]) {
				cnt += Math.abs(num1[i]-num2[i]);
			}
		}
	
		if(cnt == s.length()) return s.length()/2;
		return cnt/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xaxbbbxx";
		int result = anagram(s);
		System.out.println(result);
	}

}
