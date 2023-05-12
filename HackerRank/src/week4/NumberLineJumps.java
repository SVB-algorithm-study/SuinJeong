package week4;

public class NumberLineJumps {
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    // Write your code here
	    String result = "NO";
	    
	    while(result == "NO") {
	    	x1 += v1;
	    	x2 += v2;
	    	if(x1 == x2) {
	    		result = "YES";
	    	}if(x1 < 0) break; //무한대로 조건이 안끝날 때.
	    }
	    
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 0, v1 = 2, x2 = 5, v2 = 3;
		String result = kangaroo(x1,v1,x2,v2);
		System.out.println(result);
	}

}
