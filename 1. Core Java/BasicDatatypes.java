import java.util.*;
//Data Types in Java
//Data types specify the type of data that can be stored inside variables in Java.

//Final Keyword in Java
// The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
//     a. variable
//     b. method
//     c. class


class BasicDatatypes extends AccessData{
    public static void main(String args[])
    {
        // --------------- DATA TYPES IN JAVA ------------------

        // 1.Boolean Data Type: The boolean data type has two possible values, either true or false.
        boolean flag = true;
        System.out.println(flag);    // prints true

        // 2.Byte Data Type: The byte data type can have values from -128 to 127
        byte range1;
        range1 = 124;
        System.out.println(range1);    // prints 124
        
        // 3.Short Data Type: The short data type in Java can have values from -32768 to 32767
        short temperature;
        temperature = -200;
        System.out.println(temperature);  // prints -200

        // 4.Int Data Type: The int data type can have values from -2^31 to 2^31-1 
        int range2 = -4250000;
        System.out.println(range2);  // print -4250000

        // 5.Long Data Type: The long data type can have values from -2^63 to 2^63-1 
        long range3 = -42332200000L;
        System.out.println(range3);    // prints -42332200000

        // 6.Double Data Type: The double data type is a double-precision 64-bit floating-point.
        double number1 = -42.3;
        System.out.println(number1);  // prints -42.3

        // 7.Float Data Type: The float data type is a single-precision 32-bit floating-point
        float number2 = -42.3f;
        System.out.println(number2);  // prints -42.3

        // 8.Char Data Type: It's a 16-bit Unicode character.
        char letter = '\u0051';
        System.out.println(letter);  // prints Q

        // 9.String Data Type: Java also provides support for character strings via java.lang.String class. 
        // Strings in Java are not primitive types. Instead, they are objects
        String myString = "Anmol Singh Yadav";

        // ----------------- Modifier Types in Java ---------------------

        // Access modifiers are used to set the accessibility (visibility) of classes, interfaces, variables, methods, constructors, data members, and the setter methods.

        // Types of Access Modifiers:
        //    1. Default	declarations are visible only within the package (package private)
        //    2. Private	declarations are visible within the class only
        //    3. Protected	declarations are visible within the package or all subclasses
        //    4. Public	declarations are visible everywhere

        
        
        AccessData ad = new AccessData();
        // Calling Default Access Modifier:
        ad.message(); // prints  Java is fun to learn!!

        // Calling Private Access Modifier
        // ad.name = "Anmol"; // error: name has private access in AccessData
        
        // Calling Protected Access Modifier (Using extends <Class Name>)
        ad.secret(); // Prints I know you love C++
        
        // Calling Public Access Modifier
        ad.age = 21;
        System.out.println("AGE: "+ad.age);

        // ----------------- FINAL KEYWORD IN JAVA -----------------------
        Bike honda = new Bike();
        // honda.accelarate(); //error: cannot assign a value to final variable speedLimit

        // Final Keyword in a Method
        // honda.run(); //error: run() in Honda cannot override run() in Bike

        // Final Keyword in a Class
        Maruti brezza = new Maruti();
        // brezza.run(); // Compile Time Error


    }
}

// Class AccessData to demonstrate usage of Access Specifiers in Java

class AccessData{
    // 1. Default Access Modifier:
    void message()
    {
        System.out.println("Java is fun to learn!!");
    }
    
    // 2. Private Access Modifier
    private String name;
    
    // 3. Protected Access Modifier
    protected void secret()
    {
        System.out.println("I know you love C++");
    }

    // 3. Public Access Modifier
    public int age;
}

// Class Bike to demonstate the usage of Final Keyword in Variable, Method and class
class Bike{
    //final int speedLimit = 90;
    void accelarate()
    {
        speedLimit = 400;
    }
    // Final used in a Method
    final void run()
    {
        System.out.println("Running");
    }
}

class Honda extends Bike{
    void run()
    {
        System.out.println("Running Safely with 100 Kmph");
    }
}

// A Class to demonstrate Final used in Class
final class Car{

}

class Maruti extends Car{
    void run()
    {
        System.out.println("Running Safely in 100 kmph");
    }
}