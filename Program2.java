package GFG;

import java.io.IOException;

public class Program2
{
//    static int MaxnMin(int[] a)
//    {
//        int result=0;
//        for(int i=0; i<a.length; i++)
//        {
//            if(a[i]>a[result])
//            {
//                result=i;
//            }
//        }
//        return result;
//    }
    public static void main(String args[]) throws IOException
    {
        int[] a= new int[]{1,7,3,2,9};
//        Program2 obj=new Program2();

        int catchy=Max(a);
        catchy=catchy+1;
        System.out.println("Maximum element at position "+catchy);
        int catchy2=Min(a);
        System.out.println("Minimum element at position "+catchy2);

    }

    private static int Max(int[] a) {

        int result=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>a[result])
            {
                result=i;
            }
        }
        return result;
    }

    private static int Min(int[] a)
    {
        int result2=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<result2)
            {
                result2=i;
            }

        }
        return result2;
    }


}
