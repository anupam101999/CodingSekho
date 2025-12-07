package EngineeringDigest.Runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Generic Runnable");
            }
        };

        Runnable r = () -> {
            System.out.println();
            System.out.println("Lambda Runnable");
        };

        Thread t = new Thread(run);
        Thread t1 = new Thread(r);
        t.start();
        t1.start();

        Thread t3 = new Thread(() -> System.out.println("Test"));
        t3.start();
    }
}
