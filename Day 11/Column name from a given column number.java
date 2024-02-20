
class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder ans = new StringBuilder();
        while(n>0)
        {
            n--;
            ans.append((char)('A'+n%26));
            n /=26;
        }
        return ans.reverse().toString();
    }
}