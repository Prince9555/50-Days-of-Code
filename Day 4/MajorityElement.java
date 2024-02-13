class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int majorityElement =a[0];
        int count =1;
        for(int i=1;i<size;i++)
        {
            if(count ==0)
            {
                majorityElement = a[i];
                count =1;
            }
            else if(a[i]==majorityElement)
            {
                count++;
            }
            else{
                count--;
            }
        } count = 0;
        for (int num = 0; num < size; num++) {
            if (a[num] == majorityElement) {
                count++;
            }
        }
        
        if (count > size / 2) {
            return majorityElement;
        } else {
            return -1; // No majority element found
        }
    }
}