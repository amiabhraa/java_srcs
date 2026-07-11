public class multiThread2 implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println("This is by ->"+Thread.currentThread().getName());
        }
    }
}
