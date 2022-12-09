import java.util.*;

// ------------------------- Collections in Java -----------------------

// 1. Collection in Java

// 1.1 Definition: The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
// The Collection interface is the interface which is implemented by all the classes in the collection framework

// Types of Classes Implemented by Collection
//  a. List          g. Priority Queue
//  b. ArrayList     h. Deque
//  c. LinkedList    i. ArrayDeque
//  d. Vector        j. Set
//  e. Stack         k. HashSet
//  f. Queue



class Collection{
    public static void main(String args[])
    {
        // 1. List
        // Syntax: List<data-type> listName= new ArrayList<>();
        // Syntax: List<data-type> listName= new LinkedList<>();
        // Syntax: List<data-type> listName= new Vector<>();
        // Syntax: List<data-type> listName= new Stack<>();

        ArrayList<String> names = new ArrayList<>();
        names.add("Ironman");
        names.add("Thor");
        names.add("Captain America");
        names.add("Hulk");

        for(String ele:names)
        {
            System.out.println(ele);
        }

        // 2. Queue
        PriorityQueue<String> queue=new PriorityQueue<String>();  
        queue.add("Amit Sharma");  
        queue.add("Vijay Raj");  
        queue.add("JaiShankar");  
        queue.add("Raj");  
        for(String ele:queue)
        {
            System.out.println(ele);
        }

        // 3. HashSet
        HashSet<Integer> set = new HashSet<>();  
        set.add(1);  
        set.add(5);  
        set.add(2);
        set.add(3);  
        set.add(4);  
        set.add(2);  
        for(Integer ele:set)
        {
            System.out.println(ele);
        }
    }
}