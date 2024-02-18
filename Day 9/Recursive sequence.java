
class Solution {
    static long sequence(int n) {
        long mod = 1000000007; // 10^9 + 7
        long result = 0;
        long term = 1;
        long currentNumber = 1;
        
        for (int i = 1; i <= n; i++) {
            term = 1;
            for (int j = 0; j < i; j++) {
                term = (term * currentNumber) % mod;
                currentNumber++;
            }
            result = (result + term) % mod;
        }
        
        return result;
    }
}
