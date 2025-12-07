package EngineeringDigest.ThreadClass;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("MAX_PRIORITY");
        MyThread m = new MyThread("NORM_PRIORITY");
        MyThread n = new MyThread("MIN_PRIORITY");
        l.setPriority(Thread.MAX_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MIN_PRIORITY);
        l.start();
        l.yield();
        // Interrupt the method
        //l.interrupt();
        m.start();
        n.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: "
                    + Thread.currentThread().getPriority());

//            Thread.yield();
//            try {
//               Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }
    }
}

//Demon threads which runs in background
