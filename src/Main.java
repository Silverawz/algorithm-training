import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String args[]) {

		System.out.println(findUniq(new double[] { 74.0,
				24.0,
				24.0,
				24.0,
				24.0,
				24.0,
				24.0,
				24.0}));
		// System.out.println(countBits(1234));
		// System.out.println(encrypt("This is a test!", 3));
		// System.out.println(decrypt("s eT ashi tist!", 2));
	}

	public static double findUniq(double arr[]) {
		double one = arr[0];
		double two = arr[1];
		double result = 0;
		A: for (int i = 0; i < arr.length; i++) {
			if (one != two) {
				if (arr[2] == one) {
					result = two;
					break A;
				} else if (arr[2] == two) {
					result = one;
					break A;
				}
			}
			if (arr[i] != one) {
				result = arr[i];
				break A;
			}
		}
		return result;
	}

	/*
	 * 
	 * public static int countBits(int n){ String binaryString =
	 * Integer.toBinaryString(n); int result = 0; for(int i = 0; i <
	 * binaryString.length(); i++) { if(binaryString.charAt(i)=='1') { result++; } }
	 * return result; }
	 * 
	 * public static String encrypt(final String text, final int n) { if (n <= 0 ||
	 * text == null || text.length() == 0) { return text; } String origin = text;
	 * List<Character> charArrayEncryptPart1 = new ArrayList<Character>();
	 * List<Character> charArrayEncryptPart2 = new ArrayList<Character>();
	 * List<Character> finalCharArray = new ArrayList<Character>(); char[]
	 * stringToCharArray; int validationIteration = 0; while (validationIteration !=
	 * n) { stringToCharArray = origin.toCharArray(); for (int i = 0; i <
	 * stringToCharArray.length; i++) { if (i % 2 != 0) {
	 * charArrayEncryptPart1.add(stringToCharArray[i]); } else if (i % 2 == 0) {
	 * charArrayEncryptPart2.add(stringToCharArray[i]); } } finalCharArray =
	 * charArrayEncryptPart1; finalCharArray.addAll(charArrayEncryptPart2); origin =
	 * finalCharArray.stream().map(e -> e.toString()).reduce((acc, e) -> acc +
	 * e).get(); charArrayEncryptPart1 = new ArrayList<Character>();
	 * charArrayEncryptPart2 = new ArrayList<Character>(); validationIteration++; }
	 * return origin; }
	 * 
	 * public static String decrypt(final String encryptedText, final int n) { if (n
	 * <= 0 || encryptedText == null || encryptedText.length() == 0) { return
	 * encryptedText; } String origin = encryptedText; List<Character>
	 * charArrayEncryptPart1 = new ArrayList<Character>(); List<Character>
	 * charArrayEncryptPart2 = new ArrayList<Character>(); List<Character>
	 * finalCharArray = new ArrayList<Character>(); char[] stringToCharArray; int
	 * validationIteration = 0; while (validationIteration != n) { stringToCharArray
	 * = origin.toCharArray(); int nbreOfElementPaired = stringToCharArray.length/2;
	 * for (int i = 0; i < stringToCharArray.length; i++) { if(i <
	 * nbreOfElementPaired) { charArrayEncryptPart1.add(stringToCharArray[i]); }
	 * else { charArrayEncryptPart2.add(stringToCharArray[i]); } } int indexA=0; int
	 * indexB=0; for(int j=0; j < stringToCharArray.length; j++) { if(j%2 != 0 &&
	 * charArrayEncryptPart1.size() > indexA) {
	 * finalCharArray.add(charArrayEncryptPart1.get(indexA)); indexA++; } else
	 * if(j%2 == 0 && charArrayEncryptPart2.size() > indexB) {
	 * finalCharArray.add(charArrayEncryptPart2.get(indexB)); indexB++; } } origin =
	 * finalCharArray.stream().map(e -> e.toString()).reduce((acc, e) -> acc +
	 * e).get(); charArrayEncryptPart1 = new ArrayList<Character>();
	 * charArrayEncryptPart2 = new ArrayList<Character>(); finalCharArray = new
	 * ArrayList<Character>(); validationIteration++; } return origin; }
	 */
}
