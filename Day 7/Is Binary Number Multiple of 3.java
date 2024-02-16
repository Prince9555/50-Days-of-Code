class Solution {
    int isDivisible(String s) {
        // code here
    
        int n = s.length();
        int oddCount = 0, evenCount = 0;

        // Traverse the binary number from right to left
        for (int i = n - 1; i >= 0; i--) {
            char bit = s.charAt(i);
            // Increment oddCount if the position is odd and the bit is set
            if ((n - i) % 2 == 1 && bit == '1') {
                oddCount++;
            }
            // Increment evenCount if the position is even and the bit is set
            else if ((n - i) % 2 == 0 && bit == '1') {
                evenCount++;
            }
        }

        // Compute the absolute difference between oddCount and evenCount
        int diff = Math.abs(oddCount - evenCount);
        
        // Check if the absolute difference is divisible by 3
       if(  diff % 3 == 0){
            return 1;
        }
        return 0;
    }
}
