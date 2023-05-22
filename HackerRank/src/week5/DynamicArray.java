package week5;

import java.io.BufferedReader; //엄청 많은 라이브러리...
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {
	
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
	    // Write your code here
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		int idx = 0;
		int lastAnswer = 0;
		
		for(int i = 0; i<n; i++) {
			arr.add(new ArrayList<>());
		}
		
		for(int i = 0; i<queries.size(); i++) {
			if(queries.get(i).get(0)==1) {
				idx = (queries.get(i).get(1) ^ lastAnswer) % n;
				arr.get(idx).add(queries.get(i).get(2));
			}else if(queries.get(i).get(0)==2) {
				List<Integer> ar = arr.get((queries.get(i).get(1) ^ lastAnswer) % n);
				lastAnswer = ar.get(queries.get(i).get(2) % ar.size());
				result.add(lastAnswer);
			}
		}
		
	    return result;
	}

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}
