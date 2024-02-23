public class acendingRecresion {

  public static void printAce(int start,int n){
      if(start==n)
      {
        System.out.println(n);
        return;
      }
      System.out.print(start+" ");
      printAce(start+1, n);

  }
  public static void main(String[] args) {
    int n=12;
    int start=1;
    printAce(start,n);
  }
}
