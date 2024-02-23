public class fib {
  public static int Fib(int n){

    if(n==0||n==1)
    {
      return n;
    }
int fn=Fib(n-1)+Fib(n-2);
return fn;
  }
  public static void main(String[] args) {
    int n=25;
    int ans=Fib(n);
    System.out.println(ans);
  }
}
