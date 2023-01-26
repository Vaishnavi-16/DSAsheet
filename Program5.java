package GFG;

public class Program5 {
    public static void main(String args[])
    {
        int a[]= {1,-11,-2,9,43,-8,1,4,-7};
        rearrange(a);
    }
    private static void rearrange(int a[])
    {
        int t[]=new int[a.length]; // temp
        int j=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>=0)
                t[j++]=a[i]; // elements +ve to be stored in temp
            if(j==a.length || j==0) // if all elements or zero elements are positive return
                return;}
        for(int i=0; i<a.length; i++)
        {
            if(a[i]<0) // -ve elements to be stored at end of t
                t[j++]=a[i];


        }
        for(int i=0; i<a.length; i++)
        {
            a[i]=t[i]; // tranfer contents of t to a
            System.out.print(a[i]+" ");
        }

    }
}
