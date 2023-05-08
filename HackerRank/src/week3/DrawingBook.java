package week3;

public class DrawingBook {
	
	public static int pageCount(int n, int p) {
	    // Write your code here
	        //int answer = 0;
	        //if(n/2 - p/2 > p/2) answer = p/2;
	        //else answer = n/2-p/2;
	        return (n/2 - p/2 > p/2? p/2 : n/2-p/2);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int p = 3;
		int result = pageCount(n,p);
		System.out.println(result);
	}

}
