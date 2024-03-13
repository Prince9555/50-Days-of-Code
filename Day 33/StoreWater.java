import java.util.*;;

public class StoreWater {
  public static int store(ArrayList<Integer> hirgth) {
    int max=0;
    for(int i=0;i<hirgth.size();i++)
    {
      for(int j=i+1;j<hirgth.size();j++)
      {
        int ht=Math.min(hirgth.get(i), hirgth.get(j));
        int wid=j-1;
        int curr=ht*wid;
        max=Math.max(max, curr);
      }
    }
    return max;

  }

  public static void main(String[] args) {
    ArrayList<Integer> hirgth = new ArrayList<>();

    hirgth.add(1);
    hirgth.add(8);
    hirgth.add(6);
    hirgth.add(2);
    hirgth.add(5);
    hirgth.add(4);
    hirgth.add(8);
    hirgth.add(3);
    hirgth.add(7);
    System.out.println(store(hirgth));

  }
}
