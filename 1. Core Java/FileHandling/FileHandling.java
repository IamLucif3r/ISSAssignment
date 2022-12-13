import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


// -------------- FILE HANDLING IN JAVA --------------------

class FileHandling
{
    public static void main(String[] args) throws IOException
        {
            // Accept a string
            String str = "File Handling in Java using FileWriter and FileReader";
    
            // +++++++++++++++ 1. FILE WRITER ++++++++++++++++++++

            // attach a file to FileWriter
            FileWriter fileWriter = new FileWriter("output.txt");
    
            // read character wise from string and write into FileWriter
            for (int i = 0; i < str.length(); i++)
                fileWriter.write(str.charAt(i));

            System.out.println("Writing successful");

            // +++++++++++++++++ 2. FILE READER ++++++++++++++++++++++++++++
            //Variable Declaration
            int ch;
            //Checking If File Exists
            FileReader fr=null;
            try
            {
                fr = new FileReader("output.txt");
            }
            catch (FileNotFoundException fe)
            {
                System.out.println("File not found");
            }
            // read from FileReader till the end of file
            while ((ch=fr.read())!=-1)
                System.out.print((char)ch);
            //close the file
            fr.close();
            fileWriter.close();
        }
}