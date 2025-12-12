package Java8.Code;

import Java8.GenericClass.Emp;
import Java8.GenericClass.Employees;
import Java8.GenericClass.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Third03 {
    public static void main(String[] args) {
        //50. Whose salary is more than 20000
        List<Emp> empList = List.of(new Emp(20000, "Anupam"),
                new Emp(70000, "Sam"), new Emp(40000, "Ram"));
        empList.stream().filter(e -> e.getSalary() > 20000).toList()
                .forEach(System.out::println);

        System.out.println();

        //51. Sort by First Name and Last name
        List<Person> personList = List.of(new Person("Boby", "Jindal"), new Person("Boby", "Sam")
                , new Person("Anup", "Ram"), new Person("Watson", "Jindal"));
        personList.stream().sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName)).
                toList().forEach(System.out::println);

        //53. Find the dept which has maximum num of emp
        List<Employees> employeesList = List.of(new Employees(10000, "ANUPAM", "IT"),
                new Employees(19000, "RAM", "CSE"),
                new Employees(40000, "RAM", "ME"),
                new Employees(10300, "HA", "IT"),
                new Employees(10800, "TISA", "IT"));
        System.out.println("53. Find the dept which has maximum num of emp------------------------");
        Map<String, Long> map = employeesList.stream().
                collect(Collectors.groupingBy(Employees::getDept, Collectors.counting()));
        var value = map.entrySet().stream().max(Map.Entry.comparingByValue());
        value.ifPresent(x -> System.out.println(x.getValue()));

        //54. Avg salary dept wise
        Map<String, Double> collect = employeesList.stream()
                .collect(Collectors.groupingBy(Employees::getDept, Collectors.averagingDouble(Employees::getSalary)));
        collect.forEach((dept, sal) -> System.out.println("dept : " + dept + ", sal : " + sal));

        //
        Map<String, Double> ram = employeesList.stream().filter(n -> n.getName().equalsIgnoreCase("Ram"))
                .collect(Collectors.groupingBy(Employees::getName, Collectors.averagingDouble(Employees::getSalary)));
        System.out.println("------------"+ram.values());

        double ram1 = employeesList.stream().filter(i -> i.getName().equalsIgnoreCase("Ram"))
                .mapToLong(Employees::getSalary).average().getAsDouble();
        System.out.println("-------------"+ram1);

        //My Ques , filter dept who works in IT and count of employee
        Map<String, DoubleSummaryStatistics> collect1 = employeesList.stream()
                .filter(emp -> "IT".equalsIgnoreCase(emp.getDept()))
                .collect(Collectors.groupingBy(Employees::getDept,
                        Collectors.summarizingDouble(Employees::getSalary)));
          System.out.println(collect1);

        //55. Return size of the fruit
        List<String> fruits=List.of("Banana","Apple","kiwi");
        Map<String, Integer> collect2 = fruits.stream().collect(Collectors.toMap(fruit -> fruit, String::length));
        System.out.println(collect2);
    }
}
