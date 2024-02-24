class Solution { 
  
  static int gethelp(int n){
     if(n==1 || n == 7)   return 1;
     if(n== 2 || n==3 || n==4 || n==5 ||n==6 || n ==8 || n==9)   return 0;
     int sum = 0;
     while(n>0){
         int x = n%10;
         sum = sum + x*x;
         n = n/10;
     }
     return gethelp(sum);
 }

  static int isHappy(int N) { 
      
     return gethelp(N);
  }
}