package Task;
import java.util.*;
public class ArrayAntiClockWise {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		for(int i=2;i>=0;i--)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}

Input:
Matrix:   1  2  3
          4  5  6
          7  8  9

Output:  3  6  9 
         2  5  8 
         1  4  7
