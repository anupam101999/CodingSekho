package Java8.Code;

import Java8.GenericClass.Emp;
import Java8.GenericClass.Employees;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fourth04 {
    public static void main(String[] args) {

        List<Employees> employeesList = List.of(new Employees(10000, "ANUPAM", "IT"),
                new Employees(19000, "RAM", "CSE"),
                new Employees(40000, "SAM", "ME"),
                new Employees(10300, "HA", "IT"),
                new Employees(10800, "TISA", "IT"),
                new Employees(30800, "Ga", "IT"),
                new Employees(14800, "SAS", "IT"));

//        Map<String, Long> collect = employeesList.stream()
//                .collect(Collectors.groupingBy(Employees::getDept, Collectors.counting()));
//        System.out.println(collect);
//
//        Map<String, Double> collect1 = employeesList.stream()
//                .collect(Collectors.groupingBy(Employees::getDept, Collectors.averagingDouble(Employees::getSalary)));
//        System.out.println(collect1);


        Map<String, List<Employees>> first = employeesList.stream().collect(Collectors.groupingBy(Employees::getDept));
        Map<String, Long> second = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDept, Collectors.counting()));
        TreeMap<String, Set<Employees>> third = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDept, TreeMap::new, Collectors.toSet()));
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        Stream<Employees> integerStream = employeesList.stream()
                .sorted(Comparator.comparing(Employees::getSalary).reversed());
        System.out.println(integerStream.toList());
    }
}
