public class fact {

  public static int Fact(int n){
    if(n==0)
    {
      return 1;
    }
    int fn =n*Fact(n-1);
    return fn;

  }
public static void main(String[] args) {
  int n=5;
 int ans= Fact(n);
 System.out.println(ans);
}
}
