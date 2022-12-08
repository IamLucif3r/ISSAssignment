import java.util.*;

// STRINGS & ARRAYS
// String objects are stored in a special memory area known as string constant pool.

// Syntax: <String_Type> <string_variable> = "<sequence_of_string>"; 


class StringArrays{
    public static void main(String args[])
    {
        //------------------ Strings and Operations related to String -------------------
        
        //1. Memory Allotment of String: Whenever a String Object is created as a literal, the object will be created in the String constant pool. This allows JVM to optimize the initialization of String literal.

        //2.Different Ways of Creating a String
        
        //2.1 String Literal
        String str = "Java Virtual Maching";
        System.out.println(str);
        //2.2 Using New Keyword
        String name = new String("Anmol Singh Yadav");
        System.out.println(name);

        // 3. String Buffer 
        // A peer class of String that provides much of the functionality of strings. The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
        StringBuffer s = new StringBuffer("Java Development");
        // 3.1 Append
        s.append(" Kit");
        System.out.println(s);

        // ----------------------- ARRAYS --------------------------------
        // Definition: An array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements.
        
        // Types: a. Single Dimension Arrays
        //        b. Multidimensional Arrays

        // Syntax: arrayRefVar=new datatype[size];  

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        } 





    }
}