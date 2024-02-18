class Solution{
    
   
    public static int[] game_with_number(int arr[], int n) {
         for (int i = 0; i < n - 1; i++) {
             arr[i] |= arr[i + 1]; // Perform bitwise OR operation
         }
         return arr; // Return the modified array
     }
 }
 
 