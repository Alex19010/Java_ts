public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSalary(double bonus) {
        this.salary += bonus;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Зарплата: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Джофф Безос", "Менеджер", 50000);
        employee.displayInfo();
        employee.calculateSalary(5000);
        employee.updateSalary(55000);
        employee.displayInfo();
    }
}
