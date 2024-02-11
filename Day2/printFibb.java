package Day2;
public class printFibb {
    
    public static long[] printFibb(int n) 
    {
    fibonacci = new long[n]; // Array to store Fibonacci numbers
        
    // First two Fibonacci numbers are 0 and 1
    fibonacci[0] = 1;
    if (n > 1)
        fibonacci[1] = 1;
    
    // Generating Fibonacci numbers
    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }
    
    return fibonacci;//Your code here
}
}
