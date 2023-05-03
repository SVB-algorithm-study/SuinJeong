package week3;
import java.util.*;

public class ZigZagSequence {
	
	public static void ZigZagSequence(int[] arr, int n){
        Arrays.sort(arr);
        int mid = n/2;
        for(int i = 0; i<(mid+1)/2; i++) {
        	int temp = arr[mid+i];
        	arr[mid+i] = arr[arr.length-i-1];
        	arr[arr.length-i-1] = temp;
        }
        for(int i = 0; i<n; i++) {
        	System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) throws java.lang.Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i = 0; i< test_case; i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            ZigZagSequence(arr, n);
        }
    }

}
