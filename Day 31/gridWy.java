public class gridWy {

  public static int fact(int n)
  {
    if(n==1||n==2)
    {
      return n;
    }
    int ans=n*fact(n-1);
    return ans;
  }

public static int gridWay(int n,int m)
{
  int a=fact(n-1+m-1);
  int b=fact(n-1);
  int c= fact(m-1);
  int ans=a/((b*c));return ans;
}


  public static void main(String[] args) {
    System.out.println(gridWay(3,3));
  }
}
