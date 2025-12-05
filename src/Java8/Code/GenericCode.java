package Java8.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GenericCode {
    public static void main(String[] args) {

        // checkEvenOdd();
        // checkPrimeOrNot();
        // checkFactorial();
        checkPalindrome();

    }

    private static void checkPalindrome() {
        var x = 12447421;
        var strValue = String.valueOf(x);
        var size = strValue.length();
        for (int i = 0; i < size / 2; i++) {
            if (strValue.charAt(i) != strValue.charAt(size - 1 - i)) {
                System.out.println("Not Palindrome");
                break;
            }
        }
    }

    private static void checkFactorial() {
        int num = 7;
        var fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println(fact);
    }

    private static void checkPrimeOrNot() {
        List<Integer> num = List.of(2, 6, 10, 5, 15, 7, 80);
        List<Integer> prime = new ArrayList<>(List.copyOf(num));
        for (int n : num) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime.remove((Integer) n);
                    break;
                }
            }
        }

        System.out.println(prime);
    }

    private static void checkEvenOdd() {
        //Check if the number is even or odd
        List<Integer> num = List.of(2, 6, 10, 5);
        String collect = num.stream().filter(x -> x % 2 == 0)
                .map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
        Map<Boolean, List<Integer>> collect1 = num.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
        List<Integer> even = List.of();
        List<Integer> odd = List.of();
        for (var key : collect1.keySet()) {
            if (key)
                even = collect1.get(key);
            else
                odd = collect1.get(key);
        }

        System.out.println(collect1);
        System.out.println(even);
        System.out.println(odd);
    }
}
