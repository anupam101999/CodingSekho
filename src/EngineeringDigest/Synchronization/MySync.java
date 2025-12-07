package EngineeringDigest.Synchronization;

public class MySync extends Thread{
    private final Counter counter;

    public MySync(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
