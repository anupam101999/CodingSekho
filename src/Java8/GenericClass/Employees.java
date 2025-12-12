package Java8.GenericClass;

public class Employees extends Emp{
    private String dept;

    public Employees(long salary, String name, String dept) {
        super(salary, name);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", dept='" + dept + '\'' +
                '}';
    }
}
