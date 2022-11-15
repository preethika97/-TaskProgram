package Task;

import java.util.*;
import java.util.Scanner;

public class Railway {
	static void berthtype(int seatnumber) {

		if (seatnumber > 0 && seatnumber < 73)
			if (seatnumber % 8 == 1 || seatnumber % 8 == 4)
				System.out.println(seatnumber + " is lower berth");
			else if (seatnumber % 8 == 2 || seatnumber % 8 == 5)
				System.out.println(seatnumber + " is middle berth");
			else if (seatnumber % 8 == 3 || seatnumber % 8 == 6)
				System.out.println(seatnumber + " is upper berth");
			else if (seatnumber % 8 == 7)
				System.out.println(seatnumber + " is side lower berth");
			else
				System.out.println(seatnumber + " is side upper berth");
		else
			System.out.println(seatnumber + " invalid seat number");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the berthnumber : ");
		int seatnumber = sc.nextInt();
		Railway.berthtype(seatnumber);
	}
}
 Input: 10 
Output: middle berth
Input: 7 
Output: side lower berth
