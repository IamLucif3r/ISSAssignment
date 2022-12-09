import java.util.*;

// --------------------- METHOD AND BLOCK SYNCHRONIZATION ---------------------

// Threads communicate primarily by sharing access to fields and the objects reference fields refer to. This form of communication is extremely efficient, but makes two kinds of errors possible: thread interference and memory consistency errors. Some synchronization constructs are needed to prevent these errors

// 1. Method Synchronization
// Synchronized methods enables a simple strategy for preventing the thread interference and memory consistency errors. If a Object is visible to more than one threads, all reads or writes to that Object’s fields are done through the synchronized method.

// 2. Block Synchronization
// If we only need to execute some subsequent lines of code not all lines (instructions) of code within a method, then we should synchronize only block of the code within which required instructions are exists.

class Line
{
    // if multiple threads(trains) will try to access this unsynchronized method,they all will get it. So there is chance that Object's  state will be corrupted.
    public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
  
class Train extends Thread
{
    // reference to Line's Object.
    Line line;
  
    Train(Line line)
    {
        this.line = line;
    }
  
    @Override
    public void run()
    {
        line.getLine();
    }
}

class MethodSynchronization
{
        // Object of Line class that is shared among the threads.
        Line obj = new Line();
  
        // creating the threads that are sharing the same Object.
        Train train1 = new Train(obj);
        Train train2 = new Train(obj);
  
        // threads start their execution.
        train1.start();
        train2.start();

        // --------------------- BLOCK SYNC -------------------------
         BlockSync bs = new BlockSync();
        List<String> list = new ArrayList<String>();
        bs.BlockSyncName("Anmol Singh Yadav", list);
        System.out.println(bs.name);
}


// ----------- BLOCK SYNCHRONIZATION -----------------------------------

public class BlockSync
{
    String name = "";
    public int count = 0;
  
    public void BlockSyncName(String geek, List<String> list)
    {
        // Only one thread is permitted to change geek's name at a time.
        synchronized(this)
        {
            name = geek;
            count++;  // how many threads change geek's name.
        }
  
        // All other threads are permitted
        // to add geek name into list.
        list.add(geek);
    }
}