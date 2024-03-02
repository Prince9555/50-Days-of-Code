import java.util.*;
import java.io.*;

public class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            int A[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for (int i = 0;i < n;i++)
            {
                A[i] = Integer.parseInt(s[i]);
            }
            int key = Integer.parseInt(in.readLine().trim());
            
            out.println(new Solution().search(A, 0, n - 1, key));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    int search(int arr[], int si, int ei, int tar)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar)
        {
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=tar&&tar<=arr[mid]){
                return search(arr,  si, mid-1,  tar);
            }
            else{
                return search(arr,  mid+1, ei,  tar);
            }
        }
        else{
            if(arr[mid]<=tar&&tar<=arr[ei]){
                return search(arr,  mid+1, ei,  tar);
            }
            else{
                return search(arr,  si, mid-1,  tar);
            }
        }
    }
}
