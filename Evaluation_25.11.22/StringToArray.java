/*Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search
for substring like “too” in the two dimensional string both from left to right and from top to bottom.
w e L C O
M E T O Z
O H O C O
R P O R A
T I O n
And print the start and ending index as
Start index : <1,2>
End index: <3, 2>*/

package Task;

import java.util.*;

public class StringToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		char arr[][] = new char[5][5];
		char a[] = str.toCharArray();
		int l = a.length;
		int k = 0;// temp
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (k != l) {
					arr[i][j] = a[k];// assign
					k++;
				}
			}
		}
		// print the string
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.print("Enter the string to search: ");
		String str1 = sc.next();
		char b[] = str1.toCharArray();
		int i, j, Horizontal = 0, Vertical = 0;
		for (i = 0; i < 5; i++) {
			Horizontal = Vertical = 0;
			for (j = 0; j < 5 && Horizontal < b.length && Vertical < b.length; j++) {
				if (arr[i][j] == b[Horizontal]) {
					Horizontal++;
				} else if (arr[j][i] == b[Vertical]) {
					Vertical++;
				}
			}
			// left to right
			if (Horizontal == b.length) {
				System.out.println("start index :" + "[i][" + (j - b.length) + "]");
				System.out.println("End index :" + "[" + i + "][" + (b.length) + "]");
			}
			// top to bottom
			if (Vertical == b.length) {
				System.out.println("start index :" + "[" + (j - b.length) + "][" + i + "]");
				System.out.println("End index :" + "[" + (b.length) + "][" + i + "]");
			}
		}
	}
}
