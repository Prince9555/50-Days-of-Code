public class inhertiance {
  public static void main(String[] args) {
    // fish shark=new fish();
    // shark.eat();
    // shark.breath();
    // shark.swin();/
     //Dog dog =new Dog();
    // dog.eat();
    // dog.legs=4;
    // System.out.println(dog.legs);
  }
}
class Animals{
  String color;
  void eat(){
    System.out.println("eats");
  }
  void breath()
  {
    System.out.println("breath");
  }
  //Derived class

}

//Single level inhertiance
// class fish extends Animals{
//   int fins;
//   void swin(){
//     System.out.println("Swins in  the water");
//   }

// }

//Multi inhertiance
// class Mammal extends Animals{
//   int legs;
// }
// class Dog extends Mammal{
//   String breeds;
// }