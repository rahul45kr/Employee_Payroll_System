import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(int id, String name, double salary) {
        Employee emp = new Employee(id, name, salary);
        employeeList.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void displayAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        for (Employee emp : employeeList) {
            emp.displayEmployeeDetails();
        }
    }

    public void searchEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.displayEmployeeDetails();
                return;
            }
        }
        System.out.println("Employee not found!");
    }
}


