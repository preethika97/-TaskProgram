import java.util.*;

public class ProductOfArray {

	public static void main(String[] args) {
		int product;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter numbers:");
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int a[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			product = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					product = product*arr[j];
				}
			}
			a[i] = product;
		}
		for (int s : a)
			System.out.print(s +" ");
	}

}
