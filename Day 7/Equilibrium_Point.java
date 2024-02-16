
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
