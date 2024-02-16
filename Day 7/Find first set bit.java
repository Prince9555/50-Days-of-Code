class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
         int count=0;
        while(n>0)
        {
            if((n & 1)!=0)
            {
                count++;
                break;
            }
            n = n>>1;
            count++;
        }
        return count;
    }
}   