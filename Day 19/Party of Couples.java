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
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends


class Solution{
    static int findSingle(int N, int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i < N-1; i++){
            if(arr[i] != arr[i+1] ){
                if(i % 2 == 0){
                    return arr[i];
                }
            }
        }
        return arr[arr.length-1];
    }
}