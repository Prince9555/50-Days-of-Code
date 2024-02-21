class Solution {
  static String[] invIsoTriangle(int N) {
      String s="";
      String p[] = new String[N];
      int m=0;
      for(int i=N;i>=1;i--)
      {   
          for(int j=N;j>i;j--)
          {
              s+=" ";
          }
          for(int j=1;j<=2*i-1;j++)
          {
              s+="*";
          }
          for(int j=N;j>i;j--){
              s+=" ";
          }
          p[m]=s;
          m+=1;
          s="";
      }
      return p;
  }
};

