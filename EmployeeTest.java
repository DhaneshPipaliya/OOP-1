class Employee {

    private String id;
    private String name;
    private double MonthlySalary;

    // Default constructor
    public Employee() {
        id = "";
        name = "";
        MonthlySalary = 0.0;
    }

    // Setters and getters
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMonthlySalary(double MonthlySalary) {
        this.MonthlySalary = MonthlySalary;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Yearly Salary: " + (MonthlySalary * 12));
    }

    // Method to raise the salary
    public void raiseSalary(double percentage) {
        MonthlySalary += MonthlySalary * (percentage / 100);
    }
}

//Here's the Java code for the EmployeeTest class:

public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId("E101");
        e1.setName("Alice");
        e1.setMonthlySalary(5000.0);

        Employee e2 = new Employee();
        e2.setId("E102");
        e2.setName("Bob");
        e2.setMonthlySalary(5000.0);

        System.out.println("----- Initial Salaries -----");
        e1.displayEmployee();
        System.out.println();
        e2.displayEmployee();

        e1.raiseSalary(10);
        e2.raiseSalary(10);

        System.out.println("----- Salaries After Raise -----");
        e1.displayEmployee();
        System.out.println();
        e2.displayEmployee();
    }
}