package Java8.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Second02 {
    public static void main(String[] args) {

        //6. Find the words with specified vowels [2]
        var sen = "I am learning Streams API in Java";
        Arrays.stream(sen.split(" ")).filter(x -> x.replaceAll("[^aeiouAEIOU]",
                "").length() == 2).forEach(System.out::println);

        //7. List of integers divide it into 2 lists one having even another odd
        int[] arr = {2, 23, 41, 46, 15, 25, 20};
        List<Integer> list = Arrays.stream(arr).boxed().toList();

        List<List<Integer>> checklist = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0,
                Collectors.toList())).entrySet().stream().map(x -> x.getValue()).toList();
        System.out.println(checklist);

        //8. Given a word occurrence of each character
        var word = "Mississippi";
        Map<String, Long> map = Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);

        //9. Arrange the number in descending/ascending format
        int[] a = {2, 35, 1, 4, 1, 5, 4};
        list = Arrays.stream(a).boxed().toList();
        list.stream().sorted().forEach(System.out::print);
        System.out.println();
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
        System.out.println();

        //10. Given an array find the sum of unique elements
        int[] array = {1, 6, 5, 7, 1, 1, 8, 8, 7};

        //1......
        int sum = Arrays.stream(array).distinct().sum();
        System.out.println(sum);

        //2......
        list = Arrays.stream(array).boxed().toList();
        sum = list.stream().distinct().mapToInt(x -> x).sum();
        System.out.println(sum);

        //3......
        sum = list.stream().distinct().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
