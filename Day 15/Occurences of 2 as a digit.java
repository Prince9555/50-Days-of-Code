
class GfG
{
    public static long count2s(long n)

    {

        // Your code here

        long ans = 0;

        for(long i=1;i<=n;i++){

            ans+=count2sinRangeAtDigit(i);

        }

        return ans;

    }

    

    public static long count2sinRangeAtDigit(long d)

    {


        long count = 0;

        while(d>0){

            if(d%10==2){

                count++;

            }

            d = d/10;

        }

        return count;

    }
}

