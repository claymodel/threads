class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("----Synchronnization of Threads-----");
            Console.WriteLine("Main Thread {0}", Thread.CurrentThread.ManagedThreadId);
            Printer p = new Printer();

            Thread[] threads = new Thread[5];

            //Queue 5 threads
            for (int i = 0; i < 5; i++)
            {
                threads[i] = new Thread(new ThreadStart(p.PrintNumbersNonSync));
            }
            foreach (Thread t in threads)
            {
                t.Start();
            }

            Console.ReadLine();
        }
    }


    class Printer
    {
        public void PrintNumbersNonSync()
        {
            Console.WriteLine(" ");
            Console.WriteLine("Executing Thread {0}", Thread.CurrentThread.ManagedThreadId);
            for (int i = 1; i <= 10; i++)
            {
                Console.Write(i + " ");
            }

        }
           
    }

