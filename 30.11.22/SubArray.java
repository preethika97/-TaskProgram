
/* For a given array of size N, reverse every sub-array formed by 
consecutive K element. 
Note : Don't use extra space. 

Examples : 
        Input    : N = 9 
                     arr = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ] 
                     k = 3 
          Output : arr = [ 3, 2, 1, 6, 5, 4, 9, 8, 7 ] 
       
  Input    : N = 8 
                     arr = [ 1, 2, 3, 4, 5, 6, 7, 8 ] 
                     k = 5 
          Output : arr = [ 5, 4, 3, 2, 1, 8, 7 ] 
       
  Input    : N = 8 
                     arr = [ 1, 2, 3, 4, 5, 6, 7, 8 ] 
                     k = 10 
          Output : arr = [ 8, 7, 6, 5, 4, 3, 2, 1 ] */

package Task_28;

import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array size : ");
		int n = sc.nextInt();
		System.out.println("Enter the Array Elements : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("Enter k value : ");// 3
		int k = sc.nextInt();
		for (int i = 0; i < n; i += k) {
			int left = i;// 0 3
			int r = i + k - 1;// 2 5
			int right = (r < n - 1) ? r : n - 1;// 2<7 5<7
			while (left < right) {
				int temp = array[left]; // 1
				array[left] = array[right]; // 3
				array[right] = temp; // 1
				left++;
				right--;
			}
		}
		for (int a : array) {
			System.out.print(a + " ");
		}
	}
}
