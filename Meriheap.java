import java.io.*;
import java.util.*;
public class Meriheap{
    
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
        int i=0;

        for(i=0;i<n;i++)
        a[i]=s.nextInt();
      //  a.length=a.length-1;
   buildheap(a);
   System.out.println("\n\n\n"+a.length+"\n\n\n");
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);
        //int e=extractmin(a);
        decreaseKey(a,3,0);
        System.out.println("\n\n\n");
        for(i=0;i<a.length;i++)
        System.out.println(a[i]);

    }
  public static  void buildheap(int[] a)
    {
        int b=(a.length-1)/2;
        for(int i=b;i>=0;i--)
        minheapify(a,i);
        //return a;
        //for(int j=0;j<a.length;j++)
      //  System.out.println(a[j]);
    }
  public static void  maxheapify(int[] a,int i)
    {
        int l=2*i+1;
        int r=2*i+2;
        int largest;
        if(l<a.length && a[i]<a[l])
        {
            //System.out.println("dfghjk");
            largest=l;}
            else 
            largest=i;
        if(r<a.length && a[largest]<a[r])
        largest=r;
        if(largest!=i)
        {
            //System.out.println("jiiii");
            int t=a[largest];
            a[largest]=a[i];
            a[i]=t;
            maxheapify(a,largest);
        }

    }
public static void minheapify(int[] a, int i)
{
    int l=2*i+1;
    int r=2*i+2;
    int min;
    if(l<a.length && a[i]>a[l])
    min=l;
    else 
    min=i;
    if(r<a.length && a[min]>a[r])
    min=r;
    if(min!=i)
    {
        int t=a[min];
        a[min]=a[i];
        a[i]=t;
        minheapify(a,min);
    }
}
public static int extractmin(int a[])
{
    //System.out.println(a[0]);
    int beta=a[0];
    a[0]=a[a.length-1];
    a=Arrays.copyOf(a,a.length-2);
    minheapify(a,0);
    return beta;
}
public static void increaseKey(int[] a,int i,int key)
{
    if(key<a[i])
    System.out.println("value is les than previous");
    else{
        a[i]=key;
        while(i>-1 && a[i]>a[i/2])
        {
            int t=a[i];
            a[i]=a[i/2];
            a[i/2]=t;
            i=i/2;
        }
    }
}
public static void decreaseKey(int[] a,int i,int key)
{
    if(key>a[i])
    System.out.println("value is les than previous");
    else{
        a[i]=key;
        while(i>-1 && a[i]<a[i/2])
        {
            int t=a[i];
            a[i]=a[i/2];
            a[i/2]=t;
            i=i/2;
        }
    }
}
}