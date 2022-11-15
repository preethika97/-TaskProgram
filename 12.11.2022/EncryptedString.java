package Task;

import java.util.*;

public class EncryptedString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				int offset = (int) s2.charAt(j) - (int) 'a' + 1;

				System.out.print((char) ('a' + (s1.charAt(i) - 'a' + offset) % 26));
				i++;
			}
		}
	}
}
Input : 
      string 1 : mom
      string 2 : dad
Output : 
 qpq
