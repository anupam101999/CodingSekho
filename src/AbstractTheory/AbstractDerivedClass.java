package AbstractTheory;

public class AbstractDerivedClass extends AbstractBaseClass{
    @Override
    void demo() {

    }

    void demo1(){
        super.demo1();
        System.out.println("Child Class is called");
    }
}
