package Java8.Code;

public class Five05 {
    public static void main(String[] args) {
        System.out.println(test1());

    }

    private static int test1() {
        try {
            int i = 10 / 0;
            return 3;
        } catch (Throwable e) {
            return 5;
        }
        finally {
            return 20;
        }
      //  return 20;
    }
}
