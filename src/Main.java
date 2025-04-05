        import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                PayrollSystem ps = new PayrollSystem();
                int choice;

                do {
                    System.out.println("=== Employee Payroll System ===");
                    System.out.println("1. Add Employee");
                    System.out.println("2. Display All Employees");
                    System.out.println("3. Search Employee by ID");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine(); // consume newline
                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter Basic Salary: ");
                            double salary = sc.nextDouble();
                            ps.addEmployee(id, name, salary);
                            break;
                        case 2:
                            ps.displayAllEmployees();
                            break;
                        case 3:
                            System.out.print("Enter ID to search: ");
                            int searchId = sc.nextInt();
                            ps.searchEmployeeById(searchId);
                            break;
                        case 4:
                            System.out.println("Exiting system...");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                } while (choice != 4);

                sc.close();
            }
        }
