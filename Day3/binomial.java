package Day3;
// this code is medium type at gfg where we are resticted with Time Complexity: O(n*r)
public class binomial {
    

    static final int MOD = 1000000007;

    public static int nCr(int n, int r) {
        if (r > n)
            return 0;

        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }

        int inv_rfact = modInverse(fact[r]);
        int inv_n_rfact = modInverse(fact[n - r]);

        int nCr = (int) ((long) fact[n] * inv_rfact % MOD * inv_n_rfact % MOD);
        return nCr;
    }

    static int modInverse(int x) {
        return power(x, MOD - 2);
    }

    static int power(int x, int y) {
        int res = 1;
        while (y > 0) {
            if (y % 2 == 1)
                res = (int) ((long) res * x % MOD);
            y >>= 1;
            x = (int) ((long) x * x % MOD);
        }
        return res;
    }
}
