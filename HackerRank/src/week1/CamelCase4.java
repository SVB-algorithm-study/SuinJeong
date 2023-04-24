package week1;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import java.io.IOException;


public class CamelCase4 {
	
	public static String first(String s) {
		
		String[] str = s.split(";");
		String result = new String();

		if(str[0].equals("C")) {
			for(int i = 0; i<str[2].length(); i++) {
				Character c = str[2].charAt(i);
				if(c == ' ') { 
					i++;
				}
				result += c;
			}
		}else if(str[0].equals("S")) {
			for(int i = 0; i<str[2].length(); i++) {
				Character c = str[2].charAt(i);
				if(Character.isUpperCase(c) && i > 0) { 
					result += " ";
				}
				result += c;
				result = result.toLowerCase();
			}
			
		}else return result;
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        
        while ((s = bufferedReader.readLine()) != null) {
            if (s.isEmpty()) { // 더 이상 입력이 없으면 while 루프를 종료합니다.
                break;
            }
            sb.append(s).append(System.lineSeparator()); // 입력받은 문자열을 StringBuilder에 추가합니다.
        }
        
        s = sb.toString();
        
        String result = first(s);
        
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

}
