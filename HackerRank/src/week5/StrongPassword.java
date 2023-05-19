package week5;

public class StrongPassword {
	
	public static int minimumNumber(int n, String password) {
	    // Return the minimum number of characters to make the password strong
		
	    char[] pass = password.toCharArray();
	    int cnt=0, rule1=0, rule2=0, rule3=0, rule4=0;
	    for(int i = 0; i<pass.length; i++) {
	    	if((char)pass[i]>=(char)'A'&&(char)pass[i]<=(char)'Z') rule1 = 1;
	    	else if((char)pass[i]>=(char)'a'&&(char)pass[i]<=(char)'z') rule2 = 1; 
	    	else if((char)pass[i]>=(char)'0'&&(char)pass[i]<=(char)'9') rule3 = 1;
	    	else if((char)pass[i]>=(char)'!'&&(char)pass[i]<=(char)'~') rule4 = 1;
	    }
	    
	    if(n>=6) {
	    	if(rule1 != 1) cnt++;
	    	if(rule2 != 1) cnt++;
	    	if(rule3 != 1) cnt++;
	    	if(rule4 != 1) cnt++;
	    }
	    
	    if(n<6) {
			if(rule1 != 1) cnt++;
			if(rule2 != 1) cnt++;
			if(rule3 != 1) cnt++;
			if(rule4 != 1) cnt++;
			if(n+cnt < 6) cnt = 6-n;
	    }
	    
	    return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		String password = "#HackerRank";
		int result = minimumNumber(n, password);
		System.out.println(result);
	}

}
