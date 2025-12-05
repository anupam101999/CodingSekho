package Basic;

import java.util.Arrays;

public class Exception {
    public static void main(String[] args) {
        int[] a = {};
        try {
            int x = 5 / 0;
            int i = a[5];
        } catch (ArithmeticException c) {
            System.out.println(c.getLocalizedMessage());
            System.out.println(c.getMessage());
            System.out.println(Arrays.toString(c.getStackTrace()));
            System.out.println("Arithmetic");
        } catch (ArrayIndexOutOfBoundsException c) {
            c.getLocalizedMessage();
            c.getMessage();
            c.getStackTrace();
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Last line");
    }
}
