

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Timer;

public class Main {

	public static void main(String[] args) {

		/*
		 * parseToRoman(4); // === "IV" parseToRoman(37); // === "XXXVII"
		 * parseToRoman(143); // === "CXLIII" parseToRoman(1234); // === "MCCXXXIV"
		 
		System.out.println(tranformToRot13("URYYB JBEYQ"));
		System.out.println(tranformToRot13("BCRAPYNFFEBBZF"));
		System.out.println(tranformToRot13("PRPV RFG ZBA PBQR FRPERG"));	
		long startTime = System.currentTimeMillis();
		tranformToRot13("URYYB JBEYQ"); // HELLO WORLD
		tranformToRot13("BCRAPYNFFEBBZF"); // OPENCLASSROOMS
		tranformToRot13("PRPV RFG ZBA PBQR FRPERG"); // CECI EST MON CODE SECRET
		long stopTime = System.currentTimeMillis();
		System.err.println("Took "+(stopTime - startTime)+ " millisecondes"); 

		
		
		long startTime = System.currentTimeMillis();
		int[] arrayOfInt = {2,6,5,9,4,3};
		// Faire une fonction qui trie la tableau par ordre croissant et une autre par ordre decroissant
		int[] arrayOfIntModified = orderedArray(arrayOfInt);
		for (int i : arrayOfIntModified) {
			System.out.println(i);
		}
		long stopTime = System.currentTimeMillis();
		System.err.println("The task takes "+(stopTime - startTime)+ " millisecondes");
		
		
		long startTime = System.currentTimeMillis();
		String[] stringArray = {"1rzvbevezsvsvs","2zegbvsvvrbb","3zvevvsvbbsbvesvs","4zvevvsvbbsbvsvvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs"
				,"5zvevvsvnerbbsbvesvs","99999999999999999999999999zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","5zvevvsvnerbbsbvesvs","3zvevvsvbbsbvesvs"
				,"3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs"
				,"3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs"
				,"3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs"
				,"3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs","3zvevvsvbbsbvesvs"
				,"3zvevvsvbbsbvesvs"

		};
		
		// Dans le tableau de chaine de caracteres, pour chaque chaine, une lettre vaut 1
		// Calculer avec une seule fonction, la chaine de caractère ayant le plus de lettre
		
		
		System.out.println(stringWithTheMostChar(stringArray));
		long stopTime = System.currentTimeMillis();
		System.err.println("The task takes "+(stopTime - startTime)+ " millisecondes");
		*/
		
		long startTime = System.currentTimeMillis();
		
		Integer[] arr1 = {4, 23, 6, 78, 1, 54, 231, 9, 12};
		Integer[] arr = {4, 4, 6, 1, 1, 7777, 231, 9, 12,555, 3, 1, 8, 9};
		// Faire une methode pour que le tableau suivant soit trié par ordre croissant
		sortingArray(arr);
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		long stopTime = System.currentTimeMillis();
		System.err.println("The task takes "+(stopTime - startTime)+ " millisecondes");
	}

	private static Integer[] sortingArray(Integer[] arr) {
		//on va comparer element a et element a+1 tant que a+1 < taille du tableau
		//si element a < b alors on decalle d'un cran sinon on alterne les deux nombres et on decalle d'un cran
		//on repete ce processus jusqu'à ce que la boucle while ne fasse plus aucune action
		boolean firstLoop = true;
		boolean secondLoop = true;
		int a = 0;
		int b = 1;
		int checkIfNoAction = 0;		
		while(firstLoop) {		
			while (secondLoop) {	
				if (b < arr.length) {
					if (arr[a] < arr[b] || arr[a] == arr[b]) {
						//on ne fait rien					
						checkIfNoAction++;
					} else {
						//on alterne les deux élements
						int keepValue = arr[b];
						arr[b] = arr[a];
						arr[a] = keepValue;	
					}	
					a++;
					b++;
				};			
				if (b == arr.length) {
					secondLoop = false;
				}
			}
			if(checkIfNoAction+1 == arr.length) {
				firstLoop = false;
			} else {
				a = 0;
				b = 1;
				checkIfNoAction = 0;
				secondLoop = true;
			}
		}
		return arr;
	}
	
	/*
	public static String stringWithTheMostChar(String[] string) {
		int highestNumberOfChar = 0;
		String result ="";
		//int indexOfArrayOfHighestNumberOfChar = 0;
		int numberOfCharByString = 0;
		int currentIndexInTheArray = 0;
		int numberOfStrings = string.length;	
		while (currentIndexInTheArray < numberOfStrings) {		;
			for (int i = 0; i < string[currentIndexInTheArray].length(); i++) {
				numberOfCharByString++;
			}
			if(numberOfCharByString > highestNumberOfChar) {
				highestNumberOfChar = numberOfCharByString;
				//indexOfArrayOfHighestNumberOfChar = currentIndexInTheArray;	
				result = string[currentIndexInTheArray];		
			} 	
			numberOfCharByString = 0;
			currentIndexInTheArray++;		
		}
		//String result = string[indexOfArrayOfHighestNumberOfChar];		
		return result;
	}
	
	
	
	
	
	
	
	public static int[] orderedArray(int[] array) {
		int[] newArray = array;
		int[] resultArray = new int[array.length];
		int checkingEachIntHavenBeenPass = 0;
		int lowestNumber = array[0];
		while (checkingEachIntHavenBeenPass != array.length) {
			lowestNumber = 9;
			for (int i = 0; i < newArray.length; i++) {
				if (newArray[i] < lowestNumber) {
					boolean validation = true;
					A : for (int j = 0; j < resultArray.length; j++) {
						if (resultArray[j] == newArray[i]) {
							validation = false;
							break A;
						}
					}
					if(validation)
					lowestNumber = array[i];	
				} 
			}
			resultArray[checkingEachIntHavenBeenPass] = lowestNumber;
			checkingEachIntHavenBeenPass++;
		}
		return resultArray;
	}
	
	
	
	public static String tranformToRot13(String string) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] resultCharArray = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {

			if (!(string.charAt(i) == ' ')) {
				for (int j = 0; j < alphabet.length; j++) {
					if (string.charAt(i) == alphabet[j] || Character.toLowerCase(string.charAt(i)) == alphabet[j]) {
						// si j + 13 <= alphabet // alors on prend le char
						int newPosition = j + 13;
						if (j + 13 < alphabet.length) {
							resultCharArray[i] = alphabet[newPosition];
						} else { // sinon on fait x = (j + 13 - alphabet) et on prend le char a partir du debut
							int positionFromBeginReworked = newPosition - alphabet.length;
							resultCharArray[i] = alphabet[positionFromBeginReworked];
						}
						break;
					}
				}
			} else {
				resultCharArray[i] = ' ';
			}
		}

		
		String result = new String(resultCharArray);
		return result;
	}

	
	 * public static String parseToRoman(int number) { if (number == 0) { return
	 * "number is 0"; } String result = ""; String stringOfTheNumber =
	 * String.valueOf(number);
	 * 
	 * if(stringOfTheNumber.length() == 4) { int m =
	 * Character.getNumericValue(stringOfTheNumber.charAt(0)); for(int i = 0; m > i;
	 * i++) { result = result+"M"; } int c =
	 * Character.getNumericValue(stringOfTheNumber.charAt(1)); for(int k = 0; c > k;
	 * k++) { result = result+"C"; } int d =
	 * Character.getNumericValue(stringOfTheNumber.charAt(2)); for(int l = 0; d > l;
	 * l++) { result = result+"X"; }
	 * 
	 * int u = Character.getNumericValue(stringOfTheNumber.charAt(3)); if(u <= 9) {
	 * if(u == 1) { result = result+"I"; } else if(u == 2) { result = result+"II"; }
	 * else if(u == 3) { result = result+"III"; } else if(u == 4) { result =
	 * result+"IV"; } else if(u == 5) { result = result+"V"; } else if(u == 6) {
	 * result = result+"VI"; } else if(u == 7) { result = result+"VII"; } else if(u
	 * == 8) { result = result+"VIII"; } else if(u == 9) { result = result+"IV"; } }
	 * 
	 * } else if (stringOfTheNumber.length() == 3) { int c =
	 * Character.getNumericValue(stringOfTheNumber.charAt(0)); for(int k = 0; c > k;
	 * k++) { result = result+"C"; } int d =
	 * Character.getNumericValue(stringOfTheNumber.charAt(1)); for(int l = 0; d > l;
	 * l++) { result = result+"X"; } int u =
	 * Character.getNumericValue(stringOfTheNumber.charAt(2)); if(u <= 9) { if(u ==
	 * 1) { result = result+"I"; } else if(u == 2) { result = result+"II"; } else
	 * if(u == 3) { result = result+"III"; } else if(u == 4) { result = result+"IV";
	 * } else if(u == 5) { result = result+"V"; } else if(u == 6) { result =
	 * result+"VI"; } else if(u == 7) { result = result+"VII"; } else if(u == 8) {
	 * result = result+"VIII"; } else if(u == 9) { result = result+"IV"; } } } else
	 * if (stringOfTheNumber.length() == 2) { int d =
	 * Character.getNumericValue(stringOfTheNumber.charAt(0)); for(int l = 0; d > l;
	 * l++) { result = result+"X"; } int u =
	 * Character.getNumericValue(stringOfTheNumber.charAt(1)); if(u <= 9) { if(u ==
	 * 1) { result = result+"I"; } else if(u == 2) { result = result+"II"; } else
	 * if(u == 3) { result = result+"III"; } else if(u == 4) { result = result+"IV";
	 * } else if(u == 5) { result = result+"V"; } else if(u == 6) { result =
	 * result+"VI"; } else if(u == 7) { result = result+"VII"; } else if(u == 8) {
	 * result = result+"VIII"; } else if(u == 9) { result = result+"IV"; } } } else
	 * if (stringOfTheNumber.length() == 1) { int u =
	 * Character.getNumericValue(stringOfTheNumber.charAt(0)); if(u <= 9) { if(u ==
	 * 1) { result = result+"I"; } else if(u == 2) { result = result+"II"; } else
	 * if(u == 3) { result = result+"III"; } else if(u == 4) { result = result+"IV";
	 * } else if(u == 5) { result = result+"V"; } else if(u == 6) { result =
	 * result+"VI"; } else if(u == 7) { result = result+"VII"; } else if(u == 8) {
	 * result = result+"VIII"; } else if(u == 9) { result = result+"IV"; } } }
	 * return result;
	 * 
	 * }
	 */

}
