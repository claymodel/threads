using System;
using System.Threading;
 
public class MyProcess
{
 
    private ManualResetEvent _doneEvent;
 
    public MyProcess(ManualResetEvent doneEvent)
    {
        _doneEvent = doneEvent;
    }
 
    public void MyProcessThreadPoolCallback(Object threadContext)
    {
        int threadIndex = (int)threadContext;
        Console.WriteLine("thread {0} started...", threadIndex);
        StartProcess();
        Console.WriteLine("thread {0} end...", threadIndex);
 
    // Indicates that the process had been completed
        _doneEvent.Set();
    }
 
    public void StartProcess()
    {
        // TODO: Add code for processing here
 
    }
 
   
}
 
public class ThreadPoolExample
{
    static void Main()
    {
        const int totalCountToProcess = 10;
         
        ManualResetEvent[] doneEvents = new ManualResetEvent[totalCountToProcess];
        MyProcess[] MyProcessArray = new MyProcess[totalCountToProcess];
       
        // Configure and launch threads using ThreadPool:
        Console.WriteLine("launching tasks...");
        for (int i = 0; i < totalCountToProcess ; i++)
        {
            doneEvents[i] = new ManualResetEvent(false);
            MyProcess p = new MyProcess(doneEvents[i]);
            MyProcess[i] = p;
            ThreadPool.QueueUserWorkItem(p.MyProcessThreadPoolCallback, i);
        }
 
        // Wait for all threads in pool to finished processing
 
        WaitHandle.WaitAll(doneEvents);
        Console.WriteLine("All Process are complete.");
 
           }
}

