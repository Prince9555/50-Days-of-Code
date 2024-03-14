import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxWater(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    int maxWater(int arr[], int n) {
        // code here
        int maxLeft = Integer.MIN_VALUE, maxRight = Integer.MIN_VALUE, waterAmount = 0;
        int maxLeftHeight[] = new int[n], maxRightHeight[] = new int[n];
        for(int i=0;i<n;++i) {
            maxLeft = Math.max(maxLeft, arr[i]);
            maxLeftHeight[i] = maxLeft;
            maxRight = Math.max(maxRight, arr[n-i-1]);
            maxRightHeight[n-i-1] = maxRight;
        }
        for(int i=0;i<n;++i) {
            waterAmount += Math.min(maxLeftHeight[i], maxRightHeight[i]) - arr[i];
        }
        return waterAmount;
    }
}