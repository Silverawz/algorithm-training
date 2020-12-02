import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String args[]) {

		//System.out.println(encrypt("This is a test!", 3));
		System.out.println(decrypt("hsi  etTi sats!", 1));
	}

	public static String encrypt(final String text, final int n) {
		if (n <= 0 || text == null || text.length() == 0) {
			return text;
		}
		String origin = text;
		List<Character> charArrayEncryptPart1 = new ArrayList<Character>();
		List<Character> charArrayEncryptPart2 = new ArrayList<Character>();
		List<Character> finalCharArray = new ArrayList<Character>();
		char[] stringToCharArray;
		int validationIteration = 0;
		while (validationIteration != n) {
			stringToCharArray = origin.toCharArray();
			for (int i = 0; i < stringToCharArray.length; i++) {
				if (i % 2 != 0) {
					charArrayEncryptPart1.add(stringToCharArray[i]);
				} else if (i % 2 == 0) {
					charArrayEncryptPart2.add(stringToCharArray[i]);
				}
			}
			finalCharArray = charArrayEncryptPart1;
			finalCharArray.addAll(charArrayEncryptPart2);
			origin = finalCharArray.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
			charArrayEncryptPart1 = new ArrayList<Character>();
			charArrayEncryptPart2 = new ArrayList<Character>();
			validationIteration++;
		}
		return origin;
	}

	public static String decrypt(final String encryptedText, final int n) {
		if (n <= 0 || encryptedText == null || encryptedText.length() == 0) {
			return encryptedText;
		}
		String origin = encryptedText;
		List<Character> charArrayEncryptPart1 = new ArrayList<Character>();
		List<Character> charArrayEncryptPart2 = new ArrayList<Character>();
		List<Character> finalCharArray = new ArrayList<Character>();
		char[] stringToCharArray;
		int validationIteration = 0;
		while (validationIteration != n) {
			stringToCharArray = origin.toCharArray();
			int nbreOfElementPaired = stringToCharArray.length/2;
			for (int i = 0; i < stringToCharArray.length; i++) {	
				if(i < nbreOfElementPaired) {
					charArrayEncryptPart1.add(stringToCharArray[i]);
				} else {
					charArrayEncryptPart2.add(stringToCharArray[i]);
				}
			}
			int index=0;
			for(int j=0; j < stringToCharArray.length; j++) {
				if(j%2 == 0 && charArrayEncryptPart1.size() > index) {
					//even
					System.out.println("hello");
					finalCharArray.add(charArrayEncryptPart1.get(index));
				}
				else if(j%2 != 0 && charArrayEncryptPart2.size() > index) {
					//odd
					System.out.println("bonj");
					finalCharArray.add(charArrayEncryptPart2.get(index));
				}
				index++;
			}
			origin = finalCharArray.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
			charArrayEncryptPart1 = new ArrayList<Character>();
			charArrayEncryptPart2 = new ArrayList<Character>();
			validationIteration++;	
		}	
		return origin;
	}

}
