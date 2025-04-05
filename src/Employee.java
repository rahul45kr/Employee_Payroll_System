public class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private double hra;
    private double da;
    private double grossSalary;

    public Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        calculateSalary();
    }

    private void calculateSalary() {
        this.hra = 0.2 * basicSalary;  // 20% HRA
        this.da = 0.1 * basicSalary;   // 10% DA
        this.grossSalary = basicSalary + hra + da;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("------------------------------");
    }

    public int getId() {
        return id;
    }
}

