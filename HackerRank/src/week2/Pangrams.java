package week2;
import java.util.HashSet;

public class Pangrams {
	
	public static String pangrams(String s) {
	    // Write your code here
	    boolean answer = true;
	    s = s.toLowerCase();
	    
	    for(char c='a'; c<='z'; c++) {
	    	if(!s.contains(String.valueOf(c))) {
	    		answer = false;
	    	}
	    }
	   
	    return answer == true ? "pangram":"not pangram";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdEFGHIjklMnoPqRstUVwxyZ";
		String result = pangrams(s);
		
		System.out.println(result);
	}

}
