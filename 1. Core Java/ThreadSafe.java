import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


// ------------------------------ THREAD-SAFE, VOLATILE ------------------------------

// 1 Thread Safety
// When multiple threads are working on the same data, and the value of our data is changing, that scenario is not thread-safe and we will get inconsistent results. When a thread is already working on an object and preventing another thread on working on the same object, this process is called Thread-Safety.

// 2. How to achieve thread safety ?
// There are four ways to achieve Thread Safety in Java. These are:
//      a. Using Synchronization.
//      b. Using Volatile Keyword.
//      c. Using Atomic Variable.
//      d. Using Final Keyword.

// 2(a) Synchronization:

// 2(b) Volatile:
// Using volatile is yet another way (like synchronized, atomic wrapper) of making class thread-safe. Thread-safe means that a method or class instance can be used by multiple threads at the same time without any problem

// 2(c) Using Atomic Variable
// Using an atomic variable is another way to achieve thread-safety in java. When variables are shared by multiple threads, the atomic variable ensures that threads don’t crash into each other. 

// 2(d) Using Final Keyword
// Final Variables are also thread-safe in java because once assigned some reference of an object It cannot point to reference of another object. 


class ThreadSafe
{
    // -------------- Using Volatile ------------------------
    static volatile int a = 0, b = 0;
    static void method_one()
    {
        a++;
        b++;
    }
    static void method_two()
    {
        System.out.println(" a : "+a+ " b : "+b);
    }

    // Using Final Keyword
    final String str = new String("hello");

    void method()
    {
        // str = "world"; /// error: cannot assign a value to final variable str
    }
    public static void main(String args[])
    {

        // Creating an object of Class B
        B b = new B();
        // Initializing instance t1 of Thread
        // class with object of class B
        Thread t1 = new Thread(b);

        // Initializing instance t2 of Thread
        // class with object of class B
        Thread t2 = new Thread(b);
 
        // Initializing thread t1 with name
        //'Thread A'
        t1.setName("Thread A");
 
        // Initializing thread t2 with name
        //'Thread B'
        t2.setName("Thread B");
 
        // Starting thread instance t1 and t2
        t1.start();
        t2.start();

        // Calling Methods for demonstating Volatile
        Thread t3 = new Thread() {
            public void run()
            {
                for (int i = 0; i < 5; i++)
                    method_one();
            }
        };
        // Creating an instance t4 of Thread class
        Thread t4 = new Thread() {
            public void run()
            {
                for (int i = 0; i < 5; i++)
                    method_two();
            }
        };
        t3.start();
        t4.start();
        
        // Calling up  Methods to Demonstrate Thread-Safety using Atomic Variable
        // Creating an instance of Counter class
        Counter c = new Counter();
 
        // Creating an instance t1 of Thread class
        Thread t5 = new Thread(
            new Runnable() {
                public void run()
                {
                    for (int i = 1; i <= 2000; i++) {
                        c.increment();
                    }
                }
            });
 
        // Creating an instance t2
        // of Thread class
        Thread t6 = new Thread(
            new Runnable() {
                public void run()
                {
                    for (int i = 1; i <= 2000; i++) {
                        c.increment();
                    }
                }
            });
 
        // Calling start() method with t5 and t6
        t5.start();
        t6.start();
 
        // Calling join method with t5 and t6
        t5.join();
        t6.join();
 
        System.out.println(c.count);

    }
}

// -------------- 1. Using Synchronization ---------------------

class A {
    synchronized void sum(int n)
    {
        // Creating a thread instance
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                t.getName() + " : " + (n + i));
        }
    }
}
// Class B extending thread class
class B extends Thread {
 
    // Creating an object of class A
    A a = new A();
    public void run()
    {
        // Calling sum() method
        a.sum(10);
    }
}

// ---------------------- Demonstrating Thread Safety using Atomic Variable  -------------------

class Counter {
 
    // Creating a variable of class type AtomicInteger
    AtomicInteger count = new AtomicInteger();
 
    // Defining increment() method to change value of AtomicInteger variable
    public void increment()
    {
        count.incrementAndGet();
    }
}