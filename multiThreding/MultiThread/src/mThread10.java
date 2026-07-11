/*    Create one child thread. The main thread should print
the numbers 1 to 10, while the child
thread prints the letters A to J.*/

public class mThread10{
    public static void main(){
        mThread11 character = new mThread11();
        Thread t1 = new Thread(character);
        t1.start();
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }

    }
}

class mThread11 implements Runnable{
    @Override
    public void run(){
        for(char ch = 'A'; ch <= 'J'; ch++){
            System.out.println(ch + "");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }

    }
}

/*

 * Thread.sleep(milliseconds)

 * --------------------------

 * Pauses ONLY the CURRENT THREAD for the specified time.

 *

 * Example:

 * Thread.sleep(1000);  // Sleep for 1 second

 * Thread.sleep(10);    // Sleep for 10 milliseconds

 *

 * Why try-catch?

 * --------------

 * sleep() can throw InterruptedException.

 * Another thread may interrupt (wake up) the sleeping thread before

 * the sleep time is over, so Java forces us to handle this exception.

 *

 * Important:

 * ----------

 * - Only the current thread sleeps.

 * - Other threads continue executing normally.

 * - sleep() DOES NOT stop the whole program.

 *

 * Real-world analogy:

 * -------------------

 * A worker is told:

 * "Take a 10 ms break, then continue working."

 * If the boss interrupts the break early,

 * InterruptedException is thrown.

 */