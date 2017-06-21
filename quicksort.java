import java.io.*;
import java.util.*;
class quicksort{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        quickSort(a,0,n-1);
        for(int j=0;j<n;j++)
        System.out.println(a[j]);
    }
    public static void quickSort(int a[],int left,int right)
    {
        if(left>=right)
        return;
        else
        {
            int pivot=a[(left+right)/2];
            int index=partition(a,left,right,pivot);
            quickSort(a,left,index-1);
            quickSort(a,index,right);
        }
    }
    public static int partition(int a[],int left,int right,int pivot)
    {
        while(left<=right)
        {
            while(a[left]<pivot)
            left++;
            while(a[right]>pivot)
            right--;
            if(left<=right)
            {
                int t=a[left];
                a[left]=a[right];
                a[right]=t;
                left++;
                right--;
            }
        }
        return left;
    }

}