package GFG;

public class Program7 {

        public static void main(String args[]) {
            int a[]={1,2,3,4,5}; // answer should be 5,1,2,3,4
            cyclicrotate(a);
        }
        private static void cyclicrotate(int a[])
        {
            int x= a[a.length-1]; //put last element of array in temp
            for(int i=a.length-1; i>0; i--) //iterate
            {
                a[i]=a[i-1]; //shift one element ahead
            }
            a[0]=x;
            for(int i=0; i<a.length; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
