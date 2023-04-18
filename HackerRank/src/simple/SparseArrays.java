package simple;
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

public class SparseArrays {
	
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
	    
		List<Integer> answer = new ArrayList<Integer>();
        int cnt;
        
        for(String q : queries){
            cnt = 0;
            for(String s : strings){
                if(q.equals(s)){
                    cnt++;
                }
            }
            answer.add(cnt);
        }
        return answer;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("aba","baba","aba","xzxb","ab");
		List<String> queries = Arrays.asList("aba","xzxb","ab");
		
		List<Integer> ret = matchingStrings(strings, queries);
		
		System.out.println(ret);
		

	}

}
