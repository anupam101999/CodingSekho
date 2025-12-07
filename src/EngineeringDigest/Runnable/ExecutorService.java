package EngineeringDigest.Runnable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        java.util.concurrent.ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Integer> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Future<Integer> future = executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return checkFactorial(finalI);
            });
            futureList.add(future.get());
        }
        executor.shutdown();
        var a = 0;
        for (Integer f : futureList) {
            a += f;
        }
        System.out.println("Summation of all value : " + a);
    }


    private static int checkFactorial(int number) {
        var fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
}
