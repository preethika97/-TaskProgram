/*Given a String we have to reverse the string without changing the 
position of special characters, punctuations and spaces. 
 
  Example : 
    Input    : House No : 123@ CBE 
    Output : EBC32 1o : Nes@ uoH */

package Task_28;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = sc.nextLine();
		int length = findLength(input);
		String revString = "";
		for (int i = length - 1; i >= 0; i--) {
			if (input.charAt(i) != '@' && input.charAt(i) != ':' && input.charAt(i) != ' ') {
				revString += input.charAt(i);
			}
		}
		for (int i = 0, j = 0; i < length; i++) {
			if (input.charAt(i) != '@' && input.charAt(i) != ':' && input.charAt(i) != ' ') {
				System.out.print(revString.charAt(j));
				j++;
			} else
				System.out.print(input.charAt(i));
		}
	}

	static int findLength(String s) {
		char[] a = s.toCharArray();
		int length = 0;
		for (char c : a) {
			++length;
		}
		return length;
	}
}
