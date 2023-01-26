package GFG;

import java.io.IOException;

public class Program1 {
    static void reverseArray(int a[])
    {
        int start=0;
        int end=5;
        int temp=0;
        while(start<=end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;

        }
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+ " ");

        }
    }
    public static void main(String args[]) throws IndexOutOfBoundsException
    {
        int[] a= new int[]{1,2,3,4,7,8};
        reverseArray(a);


    }
}
//O(n) complexity
//same for even and odd numbers
//swapping the start element with the last element
//till start is <= end
//in odd, start=end at last case
// in even start is <= end at last case
