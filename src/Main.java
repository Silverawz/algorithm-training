import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


	public static void main(String args[]) {
		String[]result = solution("abcdefghi");
		for (String string : result) {
			System.out.println(string);
		}
	}

	 public static String[] solution(String s) {	
		 int length = s.length();	
		 String[] result = new String[length/2];
		 if(length%2 != 0) {
			 result = new String[(length/2+1)];
		 }	
		 int lengthResult = result.length;
		 int k = 0;
		 for(int i = 0; i < lengthResult; i++) {
			 if(k+1 < length) result[i] = ""+s.charAt(k)+s.charAt(k+1)+"";
			 else result[i] = ""+s.charAt(k)+"";
			 k += 2;
		 }		 
		 if(length%2 != 0) {			 
			 result[result.length-1] += "_";
		 }
		 return result;
	 }
}
