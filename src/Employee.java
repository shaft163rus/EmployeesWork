import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final int id;
    private String fullName;
    private int department;
    private int salary;



    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }






}
