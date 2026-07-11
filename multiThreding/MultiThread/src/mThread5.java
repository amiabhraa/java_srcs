/*    Create a thread using implements Runnable.
The child thread should print “I am Runnable Thread”,
and the main thread should print “I am Main Thread”*/

public class mThread5 {
    public static void main(String[] args) {
        mThread6 world = new mThread6();
        Thread t1 = new Thread(world);
        t1.start();
        System.out.println("I am a main Thread!");
    }
}

class mThread6 implements Runnable{
    @Override
    public void run(){
        System.out.println("I am a Runnable Thread!");
    }

}
