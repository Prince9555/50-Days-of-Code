 /* 
 
 
 // Base class
 class Animal {
  void eat() {
  System.out.println("Animal is eating...");
  }
  }
  // Derived class inheriting from Animal
  class Dog extends Animal {
  void bark() {
  System.out.println("Dog is barking...");
  }
  }
  public class Main {
  public static void main(String[] args) {
  Dog dog = new Dog();
  dog.eat(); // Inherited method
  dog.bark(); // Method of derived class
  }
  }

  // Base class
  class Animal {
  void eat() {
  System.out.println("Animal is eating...");
  }
  }
  // Intermediate class inheriting from Animal
  class Dog extends Animal {
  void bark() {
  System.out.println("Dog is barking...");
  }
  }
  // Derived class inheriting from Dog
  class Labrador extends Dog {
  void color() {
  System.out.println("Labrador is brown...");
  }
 }
  public class Main {
  public static void main(String[] args) {
  Labrador labrador = new Labrador();
  labrador.eat(); // Inherited from Animal
  labrador.bark(); // Inherited from Dog
  labrador.color(); // Method of derived class
  }
  }
  // Base class
  
  class Animal {
  void eat() {
  System.out.println("Animal is eating...");
  }
  }
  // Derived class 1 inheriting from Animal
  class Dog extends Animal {
  void bark() {
  System.out.println("Dog is barking...");
  }
  }
  // Derived class 2 inheriting from Animal
  class Cat extends Animal {
  void meow() {
  System.out.println("Cat is meowing...");
  }
  }
  public class Main {
  public static void main(String[] args) {
  Dog dog = new Dog();
  Cat cat = new Cat();
  dog.eat(); // Inherited method
  dog.bark(); // Method of derived class
  cat.eat(); // Inherited method
  cat.meow(); // Method of derived class
  }
  }
 */