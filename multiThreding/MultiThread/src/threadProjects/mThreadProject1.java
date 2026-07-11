 /*
 * ===============================================================
 *              JAVA MULTITHREADING SIMULATOR
 * ===============================================================

 * Project Description:
 * --------------------
 * This project is designed to simulate the behavior of concurrent
 * threads in Java using the Thread class and the Runnable interface.
 * It allows users to dynamically create multiple threads, assign
 * custom names, configure individual execution delays, and observe
 * how the JVM and Operating System scheduler execute threads
 * concurrently.

 * Objectives:
 * -----------
 * • Understand Java Multithreading
 * • Observe JVM Thread Scheduling
 * • Learn Concurrent Execution
 * • Experiment with Thread Priorities and Execution Delays
 * • Understand Thread Lifecycle and Synchronization Basics

 * Features:
 * ---------
 * • User-defined number of threads
 * • Custom thread names
 * • Custom execution delay (sleep time)
 * • Concurrent execution of all threads
 * • Real-time observation of scheduler behavior
 * • Console-based thread monitoring
 */

package threadProjects;

import java.util.Scanner;
import java.io.PrintStream;


public class mThreadProject1 {
    public static void main(String[] args){

        //making Scanner object
        Scanner sc = new Scanner(System.in);
        //making PrintStream object
        PrintStream ps = System.out;

        ps.print("How many Threads you want to Create: ");
        int threadNum = sc.nextInt();

    }
}
