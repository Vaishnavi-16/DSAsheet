package GFG;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;

public class Program3 {
    public static void main(String args[]) throws IOException
    {
        Integer a[]= {1,7,3,2,9,11,77,23};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter k for kth max");
        int k= sc.nextInt();
        kthmax(a,k);
        System.out.println("Enter k for kth min");
        int k1= sc.nextInt();
        kthmin(a,k1);
    }
    private static void kthmax(Integer a[], int k)
    {
        Arrays.sort(a);
        System.out.println(a[k-1]);


    }
    private static void kthmin(Integer a[], int k1)
    {
//        Arrays.sort(a.Collections.reverseOrder());

        System.out.println(a[k1-1]);
    }
}
