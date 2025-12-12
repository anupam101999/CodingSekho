package Java8.Code;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMap {
    public static void main(String[] args) {
        List<Employee> empList=List.of(
        new Employee("Anu","ap@gm", Arrays.asList(1,2)),
        new Employee("Pam","bn@gm", Arrays.asList(3,4)),
        new Employee("Ravi","df@gm", Arrays.asList(5,6)));


        List<String> email=empList.stream().map(Employee::getEmail).toList();
        System.out.println(email);

        List<Integer> list = empList.stream().flatMap(emp -> emp.getPhNumbers().stream()).toList();
        System.out.println(list);

        Optional<Integer> reduce = list.stream().reduce((a, b) -> a* b);
        System.out.println(reduce.get());
    }
}

class Employee{
    private String name;
    private String email;
    private List<Integer> phNumbers;

    public Employee(String name, String email, List<Integer> phNumbers) {
        this.name = name;
        this.email = email;
        this.phNumbers = phNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phNumbers=" + phNumbers +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getPhNumbers() {
        return phNumbers;
    }

    public void setPhNumbers(List<Integer> phNumbers) {
        this.phNumbers = phNumbers;
    }
}

