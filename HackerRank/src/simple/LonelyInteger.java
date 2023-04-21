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

public class LonelyInteger {
	
	public static int lonelyinteger(List<Integer> a) {
		int[] arr = {1, 1, 3, 4, 4, 5};
		int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : a) {
            if (map.get(i) == 1) {
            	answer = i;
                System.out.println(i);
            }
        }
        return answer;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(34, 95, 34, 64, 45, 95, 16, 80, 80, 75, 3, 25, 75, 25, 3, 64, 16, 31, 31);
		
		int result = lonelyinteger(a);
		//System.out.println(result);

	}

}
