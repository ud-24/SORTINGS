/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int temp;
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[j]>a[k])
				{
					temp=a[k];
					a[k]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int l=0;l<n;l++)
		System.out.println(a[l]);
	}
}