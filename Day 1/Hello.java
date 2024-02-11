package day2;

public class missing_number {
    
        int missingNumber(int array[], int n) {
            // Your Code Here
            int sum=n*(n+1)/2;
            int arraySum = 0;
             
            for(int i=0;i<n-1;i++)
            {
               arraySum += array[i];
            }
            int ans=(sum-arraySum);
            return ans;
        }
    }

