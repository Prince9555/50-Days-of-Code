import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int equilibriumPoint(long arr[], int n) {
        // Calculate total sum of all elements
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        // Initialize left sum to 0
        long leftSum = 0;
        
        // Iterate through the array to find equilibrium point
        for (int i = 0; i < n; i++) {
            // Check if current index is equilibrium point
            if (leftSum == totalSum - arr[i]) {
                // Return 1-based indexing
                return i + 1;
            }
            
            // Update left sum for next iteration
            leftSum += arr[i];
            
            // Update total sum for next iteration
            totalSum -= arr[i];
        }
        
        // If no equilibrium point found
        return -1;
    }
}
