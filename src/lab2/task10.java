import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public int yearsOfWork() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 55000, LocalDate.of(2019, 5, 20));
        System.out.println("Employee: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Hire Date: " + emp.getHireDate());
        System.out.println("Years of Work: " + emp.yearsOfWork());
    }
}
