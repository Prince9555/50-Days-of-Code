class Solution { 
  int shortestPath(int x, int y){ 

      int cnt=0;

      while(x!=y){

          if(x>y)

              x/=2;

          else

              y/=2;

          cnt++;

      }

      return cnt;

  }
}