package Java8.GenericClass;

public class Emp {
    private Long salary;
    private String name;

    public Emp(long salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
