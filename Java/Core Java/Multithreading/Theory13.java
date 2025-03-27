package com.Multithreading;

public class Theory13 {

}

//  13. Multithreading.

/*

Question-1)  Introduction to Threads.

What is a Thread?

A thread is the smallest unit of a program that can execute independently.
It is a lightweight sub-process that runs within a program to perform specific tasks.
Purpose of Threads:

Threads allow a program to perform multiple tasks simultaneously, improving performance and responsiveness.

Multithreading:
Multithreading refers to executing multiple threads concurrently within a single program.
Main Thread:

Every Java program has a default thread called the main thread, which starts program execution.
Advantages of Threads:

Concurrency: Perform multiple tasks at the same time.
Responsiveness: Makes applications more interactive (e.g., UI applications).
Efficient CPU Usage: Utilizes system resources effectively.
Faster Execution: Allows parallel execution of tasks.
How Threads Work in Java:

Threads can be created and managed using the Thread class or the Runnable interface.
Each thread runs in its own execution path, managed by the JVM and the operating system.


*/

//------------------------------------------------------------------------------------------------------------------------------------------------------

/*
 
 Question-2)  CreatingThreads by Extending Thread Class or Implementing Runnable Interface.
 
 Creating Thread By Extending Thread class:

    class ABC extends Thread{
        public void run(){
            //code to be execute
        }
    }
    public class Main{
        public static void main(String [] args){
            //thread object
            ABC obj = new ABC();
            obj.start();   // starts the thread
        }
    }

    Creating Thread by Implementing Runnable Interface

    class ABC implements Runnable{
        @override
        public void run(){
            //code to be execute
        }
    }
    public class Main{
        public static void main(String [] args){
            ABC obj = new ABC();
            Thread th = new Thread(obj);
            th.start(); // to start thread
        }
    }


*/

//---------------------------------------------------------------------------------------------------------------------------------------------------

/*
Question-3) Thread LifeCycle.

1)Newborn (New):
A thread is in the New state when it is created but has not yet started.
The thread is simply instantiated, and the start() method is not called yet.

2)Runnable:
After calling the start() method, the thread moves to the Runnable state.
The thread may still not be executing as it is waiting for CPU resources.

3)Running:
The thread is in the Running state when it is actually executing the code inside its run() method.
The thread continues to run until it completes its task or gets interrupted.

4)Blocked/Waiting:
A thread enters the Blocked or Waiting state when it cannot continue execution because it is waiting for a resource or another thread.
Blocked: Waiting for a resource (e.g., waiting for a lock).

5)Dead:
A thread enters the Dead state when it has completed its task or was terminated.
Once a thread is in the Dead state, it cannot be restarted.

*/

//-------------------------------------------------------------------------------------------------------------------------------------------------


/*
Question-4) Synchronization and Inter-thread Communication.

Synchronization:
Synchronization in Java ensures that only one thread can access a resource at a time, preventing conflicts and data inconsistency.
It's achieved using the synchronized keyword on methods or code blocks.

Why Synchronization?
When multiple threads access shared resources (like variables, files, or databases), conflicts can occur, leading to data corruption.
Synchronization ensures that only one thread at a time can access a critical section of the code (shared resource).

Inter-thread Communication:
Inter-thread Communication allows threads to communicate with each other using methods like wait(), notify(), and notifyAll().
It is mainly used for thread coordination.


*/