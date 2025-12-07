package EngineeringDigest.Synchronization;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        MySync m1=new MySync(counter);
        MySync m2=new MySync(counter);
        m1.start();
        m2.start();

        m1.join();
        m2.join();
        System.out.println(counter.getCount());
    }
}
