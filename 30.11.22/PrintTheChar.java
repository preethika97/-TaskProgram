/*Given two string of same length, print the characters which does not 
match in the two. 
 
  Example : 
    Input    : String 1 = “abcdefeghijklm” 
               String 2 = “abcduabihijkim” 
    Output :   Result = “eufaebgili”*/ 

package Task_28;

import java.util.*;

public class PrintTheChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String n = sc.next();
		System.out.println("Enter the second string:");
		String n1 = sc.next();
		String s1 = " ";
		int len = 0, len1 = 0;
		{
			for (char ch : n.toCharArray()) {
				len++;
			}
			for (char ch : n1.toCharArray()) {
				len1++;
			}
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len1; j++) {

					if (n.charAt(i) != n1.charAt(j)) {

						s1 += n.charAt(i);
						s1 += n1.charAt(j);
					}
					i++;
				}
			}
			System.out.println(s1);
		}
	}
}
