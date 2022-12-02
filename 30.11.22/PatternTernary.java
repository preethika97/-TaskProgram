/*Print the given number in to this Pattern.  
Note : Use only Ternary Operator for logic. 
 
  Example : 
          Input    : Enter the value : 3 
            Output :    3  3  3  3  3  
                        3  2  2  2  3  
                        3  2  1  2  3  
                        3  2  2  2  3  
                        3  3  3  3  3 */

package Task_28;

import java.util.*;

public class PatternTernary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Input : ");
		int n = sc.nextInt();
		int len = n * 2 - 1;
		int out[][] = new int[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print((j == len - 1 || i == 0 || i == len - 1 || j == 0) ? "3 "
						: (j == len - 2 || i == 1 || i == len - 2 || j == 1) ? "2 "
								: (j == len - 3 || i == 2 || i == len - 3 || j == 2) ? "1 " : "");

			}
			System.out.println();
		}
	}
}
