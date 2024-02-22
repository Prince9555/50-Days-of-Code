class Solution {
  public static int minimumTime(int N, int cur, int[] pos, int[] time) {
     int arr[]=new int[N];
      int min=Integer.MAX_VALUE;
      for(int i = 0;i<N;i++)
      {
         arr[i] = Math.abs((pos[i]-cur)*time[i]);
         
           if(arr[i]<min)
          {
              min=arr[i];
          }
      }
      
           return min;
  }
}  
