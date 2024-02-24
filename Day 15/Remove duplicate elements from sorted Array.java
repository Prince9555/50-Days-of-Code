class Solution {
  int remove_duplicate(int a[],int n){
      // code here
      int res=1;
      for(int i=1;i<n;i++){
          if(a[i]!=a[i-1]){
              a[res]=a[i];
              res++;
          }
      }
      return res;
  }
}
