class Solution {
    static int isPerfectNumber(long N) {
        if (N <= 1)
            return 0;

        // Find factors and sum them
        long factorsSum = 1; // 1 is always a factor
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                factorsSum += i;
                if (i != N / i) {
                    factorsSum += N / i;
                }
            }
        }

        // Check if sum of factors is equal to the number
        if (factorsSum == N)
            return 1;
        else
            return 0;
    }
}