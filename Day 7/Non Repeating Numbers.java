
class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find the rightmost set bit in xor
        int rightmostSetBit = 1;
        while ((xor & rightmostSetBit) == 0) {
            rightmostSetBit <<= 1;
        }

        // Step 3: Divide the numbers into two groups based on the rightmost set bit
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                a ^= num; // Group 1
            } else {
                b ^= num; // Group 2
            }
        }

        return new int[]{Math.min(a, b), Math.max(a, b)};
    }
}

    