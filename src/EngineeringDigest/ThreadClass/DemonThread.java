package EngineeringDigest.ThreadClass;

public class DemonThread extends Thread{
    public static void main(String[] args) {
        System.out.println(":main");
        Demon d=new Demon();
        d.start();
        d.setDaemon(true);
    }


}
