import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length() ==b.length()) 
        {
            char[]acharArray=a.toCharArray();
            char[]bcharArray=b.toCharArray();
            
            Arrays.sort(acharArray);
            Arrays.sort(bcharArray);
            
            boolean result=Arrays.equals(acharArray,bcharArray);
            if(result)
            {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
}