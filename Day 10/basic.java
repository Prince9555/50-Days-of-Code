class MathematicalOperation{
    
    static BigInteger mul(BigInteger x, BigInteger y){
    
        // Your code here
                return x.multiply(y);

        
             
    }
    
}

class MathematicalOperation{
    
    static BigInteger add(BigInteger x, BigInteger y){
            
        // Your code here
        return x.add(y);
        
    }
    
}

/artematic numberclass Solution{
    static int inSequence(int A, int B, int C){
         // If the common difference is 0 and A doesn't match B, B cannot be in the sequence
        if (C == 0)
            return A == B ? 1 : 0;
        
        // Check if (B - A) is divisible by C and the result is non-negative
        return ((B - A) % C == 0 && (B - A) / C >= 0) ? 1 : 0;
    }
}