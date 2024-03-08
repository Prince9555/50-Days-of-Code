public class SubSet {
  
  public static void findSub(String str,String ans,int i)
  {
    //base
    if (i==str.length()) {
      if(ans.length()==0)
      {
        System.out.println("null");
      }else{
      System.out.println(ans);
      }
      return;

    }

    //kaam
    findSub(str, ans+str.charAt(i), i+1);
    findSub(str, ans, i+1);
  }
  public static void main(String[] args) {
    String str="abc";
    findSub(str, "", 0);

  }
}
