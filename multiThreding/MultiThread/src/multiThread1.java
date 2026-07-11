public class multiThread1 {
    public static void main(String[] args){
        multiThread2 world = new multiThread2();
        Thread t1 = new Thread(world);
        t1.start();

        for(;;){
            System.out.println("This is by ->"+Thread.currentThread().getName());
        }
    }
}
