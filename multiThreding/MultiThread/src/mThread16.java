/*    Create three threads. Each thread should print
its own thread name 20 times. Observe the scheduling order
and see if it remains the same every time you run the program.*/

public class mThread16 {
    public static void main(String[] args){

        Thread.currentThread().setName("Application");
        mThread18 count2 = new mThread18();
        Thread t2 = new Thread(count2, "Database");
        mThread17 count1 = new mThread17();
        Thread t1 = new Thread(count1, "Login");

        t1.start();
        t2.start();

        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){}
        }
        System.out.println();
    }
}

class mThread17 implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1010);
            }
            catch(InterruptedException e){}
        }
        System.out.println();
    }
}

class mThread18 implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1020);
            }
            catch(InterruptedException e){}
        }
        System.out.println();
    }
}
