
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
 class Solution{
    int DivisibleByEight(String s){
        int len = s.length();
        if(len<=2){
            if(Integer.parseInt(s)%8==0) return 1;
        }
        int val=0;
        for(int i=len-3;i<len;i++){
            val=(val*10)+s.charAt(i)-'0';
        }
        if(val%8==0) return 1;
        return -1;
    }
}