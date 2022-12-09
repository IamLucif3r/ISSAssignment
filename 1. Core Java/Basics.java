import java.util.*;
//Basic Concepts of Java : Class, Object, State, Methods.
// Anmol Singh Yadav
// 1. Class
// A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity.
// Object: An entity that has state and behavior is known as an object
// 2. Object
// It is a basic unit of Object-Oriented Programming and represents real life entities. A typical Java program creates many objects, which as you know, interact by invoking methods
// 2.1 State: It is represented by attributes of an object. It also reflects the properties of an object
// 2.2 Behavior: It is represented by methods of an object. It also reflects the response of an object with other objects.

class Student
{
    int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // Methods
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    // A method for 'Printing Student Details'
    public String toString()
    {
        return("Hii!! This is "+this.getName()+" My Id is : "+this.getId()+" and my Age is: "+this.getAge());
    }

}

class Basics{
    public static void main(String args[])
    {
        Student s1 = new Student(7906,"Anmol Singh Yadav",21);
        System.out.println(s1.toString());
    }
}