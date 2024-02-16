class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        int p= n>>k;
        if((p & 1)==0)
        {
            return false;
        }
        return true;
    }
    
}
