import java.util.*;

// ---------- INHERITANCE, OVERRIDING, POLYMORPHISM, ABSTRACTION, ENCAPTULATION, INTERFACES, PACKAGES ---------------

// 1. Inheritance

// 1.1 Definition: Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

// 1.2 Syntax:
//      class Subclass-name extends Superclass-name  
//      {  
//          //methods and fields  
//      }  

// 1.2 Types of Inheritance
//      a. Single Inheritance
//      b. Multilevel Inheritance
//      c. Hierarchical Inheritance
//      d. Multiple Inheritance
//      e. Hybrid

// 2. Overriding

// 2.1 Definition: Method overriding is one of the way by which java achieve Run Time Polymorphism

// 3. Polymorphism

// 3.1 Definition: 

class InheritanceOverriding{
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        System.out.println("Programmar Salary : "+p.salary);
        System.out.println("Bonus of Programmer : "+p.bonus);
        // 1. Single Inheritance
        Dog d=new Dog();  
        d.bark();  
        d.eat();  
        // 2. Multilevel Inheritance
        BabyDog bd = new BabyDog();  
        bd.weep();  
        bd.bark();  
        bd.eat();  
        // 3. Hierarchical Inheritance Example
        Cat c = new Cat();  
        c.meow();  
        c.eat();  
        // ------------ Overriding ---------------
        Parent p1 = new Parent();
        p1.m1();
        p1.m2();
    }
}

// Parent Class
class Employee
{
    float salary = 30000;
}
// Sub-Class of Employee
class Programmer extends Employee
{
    int bonus = 10000;
}

// Example of Single Inheritance
class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }  
}  
class Dog extends Animal
{  
    void bark()
    {
        System.out.println("barking...");
    }  
}  
// Example of Multilevel Inheritance
class BabyDog extends Dog
{  
    void weep()
    {
        System.out.println("weeping...");
    }  
}  

// Example of Hierarchical Inheritance
class Cat extends Animal
{  
    void meow()
    {
        System.out.println("meowing...");
    }          
}  
// ------------------------ OVERRIDING IN JAVA ---------------------------------
class Parent
{
    static void m1()
    {
        System.out.println("From Parent: static m1()");
    }
    void m2()
    {
        System.out.println("From Parent: non-static m2()");
    }
}

class Child extends Parent
{
    // This methods overrides m1() in Parent
    static void m1()
    {
        System.out.println("From Chile Static m1()");
    }
    // This methods overrides m2() in Parent
    @Override
    public void m2()
    {
        System.out.println("From Child non-static m2()");
    }
}