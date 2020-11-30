import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String args[]) {

		//System.out.println(isValid("([{}])"));

		System.out.println(isValid("({})[({})]"));

	}

	public static boolean isValid(String braces) {
		System.out.println("Input value: \"" + braces + "\"");
		boolean result = false;
		int length = braces.length();
		while (!result) {
			int checkAllPairEquals = 0;
			if (length % 2 == 0) {
				for (int i = 0; i < length; i++) {
					if (braces.charAt(i) == '(' && braces.charAt(i + 1) == ')') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '[' && braces.charAt(i + 1) == ']') {
						checkAllPairEquals += 2;
					} else if (braces.charAt(i) == '{' && braces.charAt(i + 1) == '}') {
						checkAllPairEquals += 2;
					}
					i++;
				}
				if (checkAllPairEquals == length) {
					return true;
				}
				checkAllPairEquals = 0;
				int lengthModified = length - 1;
				for (int i = 0; i < length / 2; i++) {
					if (braces.charAt(i) == '(' && braces.charAt(lengthModified) == ')') {
						checkAllPairEquals += 1;
					} else if (braces.charAt(i) == '[' && braces.charAt(lengthModified) == ']') {
						checkAllPairEquals += 1;
					} else if (braces.charAt(i) == '{' && braces.charAt(lengthModified) == '}') {
						checkAllPairEquals += 1;
					}
					lengthModified -= 1;
				}
				if (checkAllPairEquals == length / 2) {
					return true;
				}
				
				// "({})[({})]"
				
				boolean start = false;
				int indexFirst = 0;
				int indexLast = 0;
				char symbol = ' ';
				String isolateString = "";
				while (!start) {
					symbol = getSymbolByIndex(braces, indexFirst);
					indexLast = indexFirst + getLastSymbol(braces, symbol, indexLast+1);
					isolateString = isolateString(braces, indexFirst, indexLast);
					
				}				
			}
			return false;
		}
		return false;
	}
	
	
	
	
	public static String isolateString(String s, int indexFirst, int indexLast) {
		String isolateString = "";
		for (int i = indexFirst ; i < indexLast; i++ ) {
			isolateString += s.charAt(i);
		}
		return isolateString;
	}

	
	public static int getLastSymbol(String s, char symbol, int indexLast) {
		A: for (int i = indexLast; i < s.length(); i++) {
			if(symbol == '(' && s.charAt(i) == ')') {
				break A;
			} else if (symbol == '{' && s.charAt(i) == '}') {
				break A;
			} else if (symbol == '[' && s.charAt(i) == ']') {
				break A;
			} else {
				indexLast++;
			}
		}	
		return indexLast;
	}
	
	public static char getSymbolByIndex(String s, int index) {
		return s.charAt(index);
	}
	
	
	
}
