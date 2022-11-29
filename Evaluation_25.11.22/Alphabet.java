/* Given a number, convert it into corresponding alphabet. 
Input Output 
1A 26 Z 27 AA 
676 ZZZ */


package Task;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = input.nextInt();
		String output = convertToAlphabet(number);
		System.out.print("Output :" + output);
	}

	public static String convertToAlphabet(int n) {

		StringBuilder result = new StringBuilder();

		while (n > 0) {

			n--;
			char ch = (char) ('A' + (n % 26));
			result.insert(0, ch);
			n /= 26;
		}
		return result.toString();
	}
}
