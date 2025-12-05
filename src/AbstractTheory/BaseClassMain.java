package AbstractTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseClassMain {
    public static void main(String[] args) {
        AbstractDerivedClass a=new AbstractDerivedClass();
        a.demo1();
        int[] b = new int[5];
        List<Integer> l=new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(15);
        Collections.sort(l);
        System.out.println(l);
    }
}
