import java.io.File;
import java.io.FileReader;


// ----------------------- EXCEPTION HANDLING IN JAVA -------------------------

// 1. Definition: An exception is a problem that arises during the execution of a program

// 1.1 Causes of Exception: 
// An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
//  a. A user has entered an invalid data.
//  b. A file that needs to be opened cannot be found.
//  c. A network connection has been lost in the middle of communications or the JVM has run out of memory.

// 2. Exception Hierarchy
// 2.1 public String getMessage(): Returns a detailed message about the exception
// 2.2 public Throwable getCause(): Returns the cause of the exception as represented by a Throwable object.
// 2.3 public String toString(): Returns the name of the class concatenated with the result of getMessage().
// 2.4 public void printStackTrace(): Prints the result of toString() along with the stack trace to System.err, the error output stream.
// 2.5 public StackTraceElement [] getStackTrace(): Returns an array containing each element on the stack trace. 
// 2.6 public Throwable fillInStackTrace(): Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.

// 3. Catching Exception
// 3.1 Syntax:
    // try {
    //    // Protected code
    // } catch (ExceptionName e1) {
    //    // Catch block
    // }

// 4. Throw v/s Throws
// 4.1 Throws : If a method does not handle a checked exception, the method must declare it using the throws keyword. The throws keyword appears at the end of a method's signature.
// 4.2 Throw :  You can throw an exception, either a newly instantiated one or an exception that you just caught, by using the throw keyword.

class ExceptionHandling
{
    public static void main(String args[])
    {
        // 1. Example Code to demonstrate occurence of Exception
        File file = new File("/etc/passwd");
        //FileReader fr = new FileReader(file); // Throws a FileNotFoundException; must be caught or declared to be thrown

        // 2. Demonstration of Try Catch 
        try{
            int a[]= new int[2];
            System.out.println("Accessing Element 3: "+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception Thrown: "+e);
        }
        System.out.println("Out of the Block");

        // 3. Demonstration of usage of Throw 
        public void deposit(double amount) throws RemoteException 
        {
            throw new RemoteException();
        }

        // 4. Demonstration of Usage of Throws
        public void withdraw(double amount) throws RemoteException, InsufficientFundsException {
        // Method implementation
        
        }
    }
    
}