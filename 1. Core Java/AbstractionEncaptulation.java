import java.util.*;

// -------------- DATA ABSTRACTION, ENCAPTULATION & INTERFACE -----------------

// 1. Data Abstraction 

// 1.1 Definition: It may be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.
// An abstract class is a class that is declared with an abstract keyword.

// 2. Encaptulation

// 2.1 Definition: Encapsulation is defined as the wrapping up of data under a single unit.
// Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

// 3. Interface

// 3.1 Definition: An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

class AbstractionEncaptulation
{
    public static void main(String args[])
    {
        // ---------- Abstraction --------------
        Shape s1 = new Circle("Red", 4.2);
        Shape s2 = new Rectangle("Yellow", 3, 5);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());

        // --------- Encaptulation --------------
        Encapsulate enc = new Encapsulate();
        enc.setName("Anmol Singh Yadav");
        enc.setAge(21);
        enc.setRoll(33);

        System.out.println("Student Name: "+enc.getName());
        System.out.println("Student Age: "+enc.getAge());
        System.out.println("Student Roll: "+enc.getRoll());

        // ---------- Interface -------------------
        TestInterface t1 = new TestInterface();
        t1.display();
        System.out.println(t1.a);


    }
}
// Example Class of Abstraction

abstract class Shape{
    String color;
    // Abstract Methods
    abstract double area();
    public abstract String toString();

    // Abstract class can have Constructor
    public Shape(String color)
    {
        System.out.println("Constructor Called");
        this.color = color;
    }

    // Concrete Method
    public String getColor()
    {
        return color;
    }
}
// Concrete Class 1
class Circle extends Shape{
    double radius;
    
    public Circle(String color, double radius)
    {
        //Shape constructor Called
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
 
    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
 
    @Override public String toString()
    {
        return "Color of the Circle is "+super.getColor()+"and area is : " + area();
    }
}

// Concrete Class 2
class Rectangle extends Shape {
 
    double length;
    double width;
 
    public Rectangle(String color, double length, double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
 
    @Override double area()
    {
        return length * width; 
    }
 
    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()+ "and area is : " + area();
    }
}
// --------------------------- Code to Demonstrate Encapsulation ---------------------------

class Encapsulate
{
    // We declare all variables as 'private' in Encaptulation
    private String studentName;
    private int studentRoll;
    private int studentAge;

    // Get Method for age to access private variable studentAge
    public int getAge()
    {
        return studentAge;
    }
    // Get Method for Name to access private variable studentName
    public String getName()
    {
        return studentName;
    }
    // Get Method for Roll to access private variable studentRoll
    public int getRoll()
    {
        return studentRoll;
    }
    // Set method for name to access private variable studentName
    public void setName(String newName)
    {
        studentName = newName;
    }
    // Set method for Roll to access private variable studentRoll
    public void setRoll(int newRoll)
    {
        studentRoll = newRoll;
    }
    // Set method for Age to access private variable studentAge
    public void setAge(int newAge)
    {
        studentAge = newAge;
    }
}

// --------------------------- Code to Demonstrate Interface ---------------------------

// A Simple Interface
interface In1
{
    final int a = 10;
    void display();
}
// A Class that Implements the Interface
class TestInterface implements In1{
    // Implementing the capabilities of Interface
    public void display()
    {
        System.out.println("Anmol Singh Yadav");
    }
}