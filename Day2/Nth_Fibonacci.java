package Day2;

public class Nth_Fibonacci {
    
static int nthFibonacci(int n){
          
    if(n <= 1)
    {
    return n;
    }

int MOD = 1000000007;
int[] fib = new int[n + 1];
fib[0] = 0;
fib[1] = 1;

for (int i = 2; i <= n; i++) {
    fib[i] = (fib[i - 1] + fib[i - 2]) % MOD;
}

return fib[n];
}
}


