import java.util.*;
public class PairSum {

  //Brute force
  public static boolean pairsum(ArrayList<Integer> list,int tar)
{
for(int i=0;i<list.size();i++)
{
  for(int j=i+1;j<list.size();j++)
  {
    if(list.get(i)+list.get(j)==tar){
      return true;

    }
  }
}
return false;

}



// 2 ponter app

public static boolean ppairsum(ArrayList<Integer> list,int tar)
{
int lp=0;
int rp=list.size()-1;
while(lp!=rp)
{
  if(list.get(rp)+list.get(lp)==tar)
  {
    return true;
  }
  if(list.get(lp)+list.get(rp)<tar)
  {
    lp++;
  }
  else{
rp--;
  }
}
return false;

}

  public static void main(String[] args) {
    ArrayList<Integer> list=new  ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int tar=58;
   //System.out.println(pairsum(list, tar));
   System.out.println(ppairsum(list, tar));   

    
  }
  
}
