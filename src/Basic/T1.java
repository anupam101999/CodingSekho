package Basic;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class T1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 3, 7};
        Optional<Integer> max = Arrays.stream(a).boxed().max(Integer::compareTo);
        System.out.println(max.get());

        int min = Arrays.stream(a).boxed().min(Integer::compareTo).get();
        System.out.println(min);

        int m = 0, n = 0;
        for (int i = 0; i < a.length; i++) {
            if (m < a[i]) {
                m = a[i];
            }
            if (n > a[i] || n == 0) {
                n = a[i];
            }
        }
        System.out.println(m + " -- " + n);

        String[] name = {"a", "b", "c", "d", "e"};
        String[] rev = new String[name.length];
        for (int i = 0; i < name.length; i++) {
            rev[name.length - i - 1] = name[i];
        }
        System.out.println(Arrays.toString(rev));
    }
}
