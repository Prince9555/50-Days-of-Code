package Day3;
import java.util.*;
public class prefixsum {

    public static void prefixSum(int arr[])
    {
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
            curr= i==0? prefix[j]:prefix[j]-prefix[i-1];
            if(maxSum<curr)
            {
                maxSum=curr;
            }
            }
        }
        System.out.println("max sum is "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        prefixSum(arr);
    }
}

