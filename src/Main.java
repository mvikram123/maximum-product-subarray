import java.util.*;
public class Main
{
    public static void main(String[] args) {


        int arr[]={ 1, -2, -3, 0, 7, -8, -2 };

       // int count=0;
        int n=arr.length;
        int mul=1;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {

            mul=1;
            for(int j=i+1; j<n; j++)
            {
                mul=mul*arr[j];
                max=Math.max(max,mul);
            }
        }
        if(max<mul)
        {
            max=mul;
            System.out.println(max);
        }
        else{
            System.out.println(max);
        }
    }
}
//output=112