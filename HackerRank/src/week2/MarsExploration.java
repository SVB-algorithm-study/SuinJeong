package week2;

import java.util.ArrayList;

public class MarsExploration {

	public static int marsExploration(String s) {
		// Write your code here
		int cnt = 0;
		ArrayList<String> str = new ArrayList<String>(s.length()/3);
		
		for(int i=0; i<s.length(); i = i+3)
		{
			str.add(s.substring(i,i+3));
			System.out.println(str);
		}
		for(int i = 0; i < str.size(); i++) {
			if(str.get(i).charAt(0) != 'S') cnt++;
			if(str.get(i).charAt(1) != 'O') cnt++;
			if(str.get(i).charAt(2) != 'S') cnt++;
		}
		//System.out.println(str);
		
			
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s = "SOSSOSSSSOSOIEISOSPOISOSIUSISO";
		 
		 int result = marsExploration(s);
		 
		 System.out.println(result);

	}

}
