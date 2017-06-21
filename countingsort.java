import java.io.*;
import java.util.*;
class countingsort{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
int i,j;

        for( i=0;i<n;i++)
        a[i]=s.nextInt();
        int max=-1;


        for( j=0;j<n;j++)
        {
            if(a[j]>max)
            max=a[j];
        }

               max=max+1;//INVOLVES CLOSED 
        int c[]= new int[max];


        for(i=0;i<max;i++)
        c[i]=0;


        for(j=0;j<n;j++)
        {
            c[a[j]]++;

        }
        for(i=1;i<max;i++)
        c[i]=c[i-1]+c[i];
        
        
        int b[] = new int[n];
        for( j=n-1;j>-1;j--)
        {
            b[c[a[j]]-1]=a[j];
            c[a[j]]=c[a[j]]-1;
        }
        System.out.println("\n\n");
        for(int k=0;k<n;k++)
        System.out.println(b[k]+"  ");
    }
}