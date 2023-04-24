package week2;

public class CountingValleys {
	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
		int place = 0;
        int vallycnt = 0;
        
        for(int i = 1; i<steps; i++){
            if(path.charAt(i-1) == 'U'){
                place += 1;
            }else {
                place -= 1;
            }if(path.charAt(i-1) == 'U' && place == 0){
                vallycnt++;
            }
        }
        //System.out.println(place);
        return vallycnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int steps = 8;
		String path = "UDDDUDUU";
		int result = countingValleys(steps, path);
		System.out.println(result);
	}

}
