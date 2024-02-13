public class Trapping_Rain_Water {
    
    class Solution {
        // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[], int n) {
            int left = 0;
            int right = n - 1;
            int left_max = 0;
            int right_max = 0;
            long water_trapped = 0;
    
            while (left < right) {
                if (arr[left] < arr[right]) {
                    if (arr[left] > left_max) {
                        left_max = arr[left];
                    } else {
                        water_trapped += left_max - arr[left];
                    }
                    left++;
                } else {
                    if (arr[right] > right_max) {
                        right_max = arr[right];
                    } else {
                        water_trapped += right_max - arr[right];
                    }
                    right--;
                }
            }
    
            return water_trapped;
        }
    }
}
