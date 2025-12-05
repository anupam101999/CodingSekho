package Java8.Code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class First01 {
    public static void main(String[] args) {
        // 1. Find the word with the highest length in Java 8
        var sen = "I am learning Streams API in Java";
        var ans = Arrays.stream(sen.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(ans);

        // 2. Remove duplicate amd return in same order
        var word = "dabcadfh";
        word.chars().distinct().mapToObj(x -> (char) x).forEach(System.out::print);
        System.out.println();
        Arrays.stream(word.split("")).distinct().forEach(System.out::print);
        System.out.println();

        //3. Find the word with second-highest word
        sen = "I am learning Streams API in Java";
        ans = Arrays.stream(sen.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(ans);

        //4. Find the word with second-highest length
        sen = "I am learning Streams API in Java";
        var length = Arrays.stream(sen.split(" ")).sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get().length();
        System.out.println(length);
        length = Arrays.stream(sen.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .get();
        System.out.println(length);

        //5. Find Occurrence of word
        sen = "I am learning Java Streams API in Java";
        Map<String, Long> collect = Arrays.stream(sen.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        collect = Arrays.stream(sen.split(" "))
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()));
        System.out.println(collect);
    }
}
