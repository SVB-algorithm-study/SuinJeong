package week4;

import java.util.List;
import java.util.ArrayList;

public class SeparateTheNumbers {
//https://sowon-dev.github.io/2021/03/01/210302al-hackerrank-Separate-the-Numbers/ 참고 
	
	public static void separateNumbers(String s) {
	    // Write your code here
		String substr = "";
		boolean isValid = false;
		
		for(int i = 1; i<=s.length()/2; i++) {
			substr = s.substring(0,i);
			Long subs = Long.parseLong(substr);
			
			String validStr = substr;
			while(validStr.length() < s.length()) {
				validStr += ++subs;
			}
			
			if(s.equals(validStr)) {
				isValid = true;
				break;
			}
		}
	    System.out.println(isValid ? "YES " + substr : "NO");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234";
		separateNumbers(s);
	}

}
