import java.util.*;

// ---------------------- MULTITHREADING --------------------------------

// 1. Multithreading 

// 1.1 Definition: It is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU.

// 1.2 Threads can be created by using two mechanisms : 
//      A. Extending the Thread class 
//      B. Implementing the Runnable Interface


class Multithreading
{
    public static void main(String args[])
    {
        int n = 8;
        for(int i=0;i<n;i++)
        {
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
        }
        
        System.out.println("Thread creation by implementing the Runnable Interface");
        int x = 8;
        for(int i=0;i<x;i++)
        {
            Thread obj2 = new Thread(new MultithreadingDemo2());
            obj2.start();
        }
    }    
}

// 1. Thread Creation by Extending the Thread Class
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is Running !!");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}

//2.Thread creation by implementing the Runnable Interface
class MultithreadingDemo2 implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is Running !!");
        }
        catch(Exception e)
        {
            System.out.println("Exception Caught");
        }
    }
}
