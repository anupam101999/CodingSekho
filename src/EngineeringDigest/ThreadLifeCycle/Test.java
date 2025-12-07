package EngineeringDigest.ThreadLifeCycle;

public class Test {
    public static void main(String[] args) {

        World world=new World(); // new
        world.start(); // runnable -> running

        World1 world1=new World1();
        Thread t=new Thread(world1);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
