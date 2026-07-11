/*    Create two threads. One thread prints
“Tick” every second, while the other prints “Tock”
every second. Observe how the output interleaves*/

public class mThread14 {
    public static void main(String[] args) {
        String s1 = "Tick";

        mThread15 count = new mThread15();
        count.start();

        for(int i = 1; i<= 10; i++){
            System.out.println(s1);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}

class mThread15 extends Thread{
    @Override
    public void run(){
        String s2 = "Tock";
        for(int i = 1; i<= 10; i++){
            System.out.println(s2);
            try {
                Thread.sleep(1001);
            }
            catch (InterruptedException e){}
        }
    }
}