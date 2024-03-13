import java.util.*;
public class Arraylist {
  


  public static void main(String[] args) {
    // ArrayList<Integer> arr1 = new ArrayList<Integer>();
    // arr1.add(1);
    // arr1.add(2); arr1.add(3);
    // arr1.add(2); arr1.add(5);
    // arr1.add(6);
    // System.out.println(arr1);
    // int a=arr1.get(3);
    // System.out.println(a);
    // arr1.remove(2);
    // System.out.println(arr1);
    // arr1.set(2,3);
    // System.out.println(arr1);
    // arr1.add(3,4);
    // System.out.println(arr1);
    // int b=arr1.size();
    // System.out.println(b);
    // Collections.sort(arr1);
    // System.out.println(arr1);
    // Collections.reverse(arr1);
    // System.out.println(arr1);

    //find max value
    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<arr1.size();i++)
    // {

    //   max=Math.max(max, arr1.get(i));
    //   System.out.println(max);

      
    // }
    // System.out.println(max);

    //swap value
    // int temp=arr1.get(0);
    // arr1.set(0, arr1.get(2));
    // arr1.set(2, temp);
    // System.out.println(arr1);



    // 2D arraylist
    ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
    ArrayList<Integer> list1= new ArrayList<>();
    ArrayList<Integer> list2= new ArrayList<>();
    ArrayList<Integer> list3= new ArrayList<>();
    for (int i=0;i<=5;i++)
    {
      list1.add(i*1);
      list2.add(i*2);
      list3.add(i*3);

    }
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    for(int i=0;i<mainList.size();i++)
    {
     // ArrayList<Integer> currList=mainList.get(i);
      for(int j=0;j<mainList.get(i).size();j++)
      {
        System.out.print(mainList.get(i).get(j)+" ");
      }
      System.out.println();
    }





  }
}
