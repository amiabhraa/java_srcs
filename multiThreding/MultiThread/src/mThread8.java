/*    Create two threads. One thread should print
 “Hello” 10 times,and the other thread should print “World”
 10 times. Observe the execution order.*/

public class mThread8 {
    public static void main(String[] args){
        mThread9 world = new mThread9();
        world.start();
        for(int i = 0; i <= 10; i++){
            System.out.println("Hello");
        }
    }
}

class mThread9 extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("World");
        }
    }
}
