/*    Create a thread using extends Thread.
The child thread should print “Hello from Child Thread”,
and the main thread should print “Hello from Main Thread”.*/

public class mThread3 {

    public static void main(String[] args){
        mThread4 second = new mThread4();
        second.start();
        System.out.println("Hello from main thread.");
    }
}

class mThread4 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello form child thread");
    }
}
