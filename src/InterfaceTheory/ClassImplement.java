package InterfaceTheory;

public class ClassImplement implements First, Second {

    @Override
    public void demo() {
        System.out.println("Implementation class 1 is called");
    }

    public void demo1() {
        System.out.println("Implementation class 2 is called");
    }
}
