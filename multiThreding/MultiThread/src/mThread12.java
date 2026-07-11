/*    Create two threads. Each thread should print
its own thread name along with numbers from 1 to 10.
 Example: main -> 1, Thread-0 -> 1, etc.*/

public class mThread12 {
    public static void main(String[] args){
        mThread13 count = new mThread13();
        Thread t1 = new Thread(count);
        t1.start();
        for(int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName() + " -> " + i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }
}

class mThread13 implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(Thread.currentThread().getName() +" -> "+ i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
    }

}
