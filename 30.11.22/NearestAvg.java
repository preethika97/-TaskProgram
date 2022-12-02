/*Find which is the nearest number in this array of average. 
 
   Example : 
            Input    : Array Elements is : [ 1, 2, 3, 4, 5 ] 
            Output : The element is : 3 
 
            Input    : Array Elements is : [ 1, 8, 2, 10 ] 
            Output : The element is : 8*/

package Task_28;

import java.util.*;

public class NearestAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num of Elements : ");
		int n = sc.nextInt(), sum = 0;
		System.out.println("Enter the elements : ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int avg = sum / n;
		int min_diff = Integer.MAX_VALUE;
		int result = -1;

		for (int i = 0; i < n; i++) {// 1 2 3 4 5
			int diff = a[i] - avg;// 1-3=-2
			if (diff < 0) {
				diff *= -1;// -2*-1=2
			}
			if (diff < min_diff) {
				min_diff = diff;// 2 1
				result = i;// 0 1
			}
		}
		System.out.print("The element is: " + a[result]);
	}
}
