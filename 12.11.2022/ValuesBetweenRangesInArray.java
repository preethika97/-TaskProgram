package Task;

import java.util.*;

public class ValuesBetweenRangesInArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int x = input.nextInt();
		int y = input.nextInt();
		int[] a = new int[6];
		for (int i = 0; i < n; i++) {
			a[i] = input.nextInt();
		}
		for (int m : a) {
			if (m > x && m < y) {
				System.out.println(m);
			}
		}
	}
}
Input : N = 6, X = 4, Y = 10, A = 4, 3, 7, 11, 50, 1
Output : 7
