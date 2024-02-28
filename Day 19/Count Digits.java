
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int evenlyDivides(int N){
        // code here
        int c=0;
        int x=N;
        while(N!=0){
            int d=0;
            d=N%10;
            N/=10;
            if(d==0)continue;
            if(x%d==0)c++;
        }
        return c;
    }
}

