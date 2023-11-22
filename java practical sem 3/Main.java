// Write a program for Inheritance& Method overriding in 
// java (this code works in w3school compiler for java)
// Base class (parent class)
class Animal {
 void speak() {
 System.out.println("Animal speaks");
 }
 void eat() {
 System.out.println("Animal eats");
 }
}
// Derived class (child class) inheriting from Animal
class Dog extends Animal {
 // Overriding the speak method
 @Override
 void speak() {
 System.out.println("Dog barks");
 }
 void wagTail() {
 System.out.println("Dog wags tail");
 }
}
// Derived class (child class) inheriting from Animal
class Cat extends Animal {
 // Overriding the speak method
 @Override
 void speak() {
 System.out.println("Cat meows");
 }
 void purr() {
 System.out.println("Cat purrs");
 }
}
public class Main {
 public static void main(String[] args) {
 Animal animal = new Animal();
 Dog dog = new Dog();
 Cat cat = new Cat();
 animal.speak();
 animal.eat();
 dog.speak();
 dog.eat();
 dog.wagTail();
 cat.speak();
 cat.eat();
 cat.purr();
 }
}
