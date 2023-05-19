package week4;

import java.util.*;

public class CaesarCipher {
	
	public static String caesarCipher(String s, int k) {
	    // Write your code here
        char[] str = s.toCharArray();
        String result = "";
        
        while(k>26) {
        	k %= 26;
        }

        for(int i = 0; i<str.length; i++) {
        	if(Character.isUpperCase(str[i])) {
        		if((char)(str[i]+k)>90) {
        			result += (char)(str[i]+k-26);
        		}else result += (char)(str[i]+k); 
        	}else if(Character.isLowerCase(str[i])) {
        		if((char)(str[i]+k)>122) {
        			result += (char)(str[i]+k-26);
        		}else result += (char)(str[i]+k);
        	}else result += str[i]; 
        }
    
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.abc.xy";
		int k = 87;
		String result = caesarCipher(s,k);
		System.out.print(result);
	}

}
