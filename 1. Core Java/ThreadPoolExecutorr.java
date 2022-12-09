// Thread Pool Executor Packages
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// --------------- THREADPOOL EXECUTOR --------------------

// 1. Definition:
// It is an ExecutorService to execute each submitted task using one of possibly several pooled threads, normally configured using Executors factory methods. 

// 2. Different Threadpool executor Methods:
//      2.1 protected void afterExecute(Runnable r, Throwable t): 
//      2.2 void allowCoreThreadTimeOut(boolean value)
//      2.3 boolean allowsCoreThreadTimeOut()
//      2.4 boolean awaitTermination(long timeout, TimeUnit unit)
//      2.5 protected void beforeExecute(Thread t, Runnable r)
//      2.6 void execute(Runnable command)
//      2.7 protected void finalize()
//      2.8 int getActiveCount()
//      2.9 long getCompletedTaskCount()
//      2.10 int getCorePoolSize()
//      2.11 long getKeepAliveTime(TimeUnit unit)
//      2.12 int getLargestPoolSize()
//      2.13 int getMaximumPoolSize()
//      2.14 int getPoolSize()

class ThreadPoolExecutorr{
    public static void main(String args[]) throws InterruptedException 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        // Stats before the task execution
        System.out.println("------------ Stats Before Tasks Execution ------------- ");
        System.out.println("Largest executions: "+ executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "+ executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: "+ executor.getPoolSize());
        System.out.println("Currently executing threads: "+ executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "+ executor.getTaskCount());
        
        executor.submit(new TestThread());
        executor.submit(new TestThread());  

        //Stats After Execution
        System.out.println("------------- Stats After Tasks Execution -------------");
        System.out.println("Core threads: " + executor.getCorePoolSize());
        System.out.println("Largest executions: "+ executor.getLargestPoolSize());
        System.out.println("Maximum allowed threads: "+ executor.getMaximumPoolSize());
        System.out.println("Current threads in pool: "+ executor.getPoolSize());
        System.out.println("Currently executing threads: "+ executor.getActiveCount());
        System.out.println("Total number of threads(ever scheduled): "+ executor.getTaskCount());
        
        executor.shutdown();

    }
}

class TestThread implements Runnable
{
    public void run()
    {
        try
        {
            Long duration = (long)(Math.random()*5);
            System.out.println("[*] Running Task! Thread Name: "+Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(duration);
            System.out.println("[*] Task Completed! Thread Name: "+Thread.currentThread().getName());
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}