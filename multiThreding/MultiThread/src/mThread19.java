/*    Create one child thread. Both the main thread
 and the child thread should print “ Current Thread: ” 50 times.
 Observe which thread gets CPU time more often.*/

public class mThread19 {
    public static void main(String[] args){

        Thread.currentThread().setName("Thread-1");
        mThread20 count = new mThread20();
        Thread t1 = new Thread(count, "Thread-2");
        t1.start();


        for(int i = 0;i <= 50;i++){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(0);
            }
            catch (InterruptedException e){

            }
        }
    }
}
class mThread20 implements Runnable{
    @Override
    public void run(){

        for(int i = 0; i < 50; i++){
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(0);
            }
            catch (InterruptedException e){

            }
        }

    }
}