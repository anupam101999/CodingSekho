package EngineeringDigest.ThreadClass;

public class Demon extends Thread{
    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for (int i = 0; i < 20; i++) {
            System.out.println("-------");
        }
    }
}
