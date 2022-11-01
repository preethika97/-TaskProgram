import java.util.*;

public class Triplets {
  
  	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n= in.nextInt();
        int[] a =new int[n];
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++) {
        	a[i] = in.nextInt();
        }
        int b[] = new int[3];
        
        for(int i=0;i<n-2;i++)
        {
        	for(int j=i+1;j<n-1;j++)
        	{
        		for(int k=j+1;k<n;k++)
        		{
        			if(a[i]+a[j]+a[k]==0)
        			{
        				System.out.println(a[i]+" "+a[j]+" "+a[k]);
        			}
        		}
        	}
        }
	}
}

        
