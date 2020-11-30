import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


	public static void main(String args[]) {

		System.out.println(isValid("(({{[[]]}})"));
		//System.out.println(isValid("[(])"));
		
	}

	public static boolean isValid(String braces) {
		boolean result = false;
		int length = braces.length();	
		while(!result) {	
			int checkAllPairEquals = 0;	
			if(length%2 == 0) {	
				for(int i = 0; i < length; i++) {	
					if(braces.charAt(i) == '(' && braces.charAt(i+1) == ')') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '[' && braces.charAt(i+1) == ']') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '{' && braces.charAt(i+1) == '}') {
						checkAllPairEquals += 2;
					}
					i++;
				}
				if(checkAllPairEquals == length) {
					return true;
				}
				checkAllPairEquals = 0;
				int lengthModified = length-1;
				for(int i = 0; i < length%2; i++) {	
					if(braces.charAt(i) == '(' && braces.charAt(lengthModified) == ')') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '[' && braces.charAt(lengthModified) == ']') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '{' && braces.charAt(lengthModified) == '}') {
						checkAllPairEquals += 2;
					}
					lengthModified -= 1;	
				}
				if(checkAllPairEquals == length) {
					return true;
				}
				return false;				
			}
			return false;
		}
	    return false;
	  }
}
