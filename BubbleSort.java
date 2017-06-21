/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int i=0;
		for( i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(i=0;i<n;i++)
		System.out.print(a[i]+"   ");
	}
}