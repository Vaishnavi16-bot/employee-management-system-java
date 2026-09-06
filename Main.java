import java.util.Scanner;

class Employee {

    int employeeId;
    String employeeName;
    String departmentName;
    int salary;
    String designation;
    int age;

    Scanner sc = new Scanner(System.in);

    void viewMenu() {
        System.out.println("1. addEmployee");
        System.out.println("2. ViewEmployee");
        System.out.println("3. SearchEmployee");
        System.out.println("4. DeleteEmployee");
        System.out.println("5. Exit");
    }

    void addEmployee() {

        System.out.print("Enter the EmployeeId: ");
        employeeId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employeeName: ");
        employeeName = sc.nextLine();

        System.out.print("Enter departmentName: ");
        departmentName = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter designation: ");
        designation = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.println("Employee Added");
    }

    void viewEmployee() {

        System.out.println("EmployeeId: " + employeeId);
        System.out.println("EmployeeName: " + employeeName);
        System.out.println("DepartmentName: " + departmentName);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
    }

    void searchEmployee() {

        System.out.print("Enter searchId: ");
        int searchId = sc.nextInt();

        if (employeeId == searchId) {
            System.out.println("Employee Found");
            System.out.println("EmployeeId: " + employeeId);
            System.out.println("EmployeeName: " + employeeName);
            System.out.println("DepartmentName: " + departmentName);
            System.out.println("Salary: " + salary);
            System.out.println("Designation: " + designation);
            System.out.println("Age: " + age);
        }
        else {
            System.out.println("EmployeeNotFound");
        }
    }

    void deleteEmployee() {

        System.out.print("Enter employeeId: ");
        int deleteId = sc.nextInt();

        if (employeeId == deleteId) {

            employeeId = 0;
            employeeName = "";
            departmentName = "";
            salary = 0;
            designation = "";
            age = 0;

            System.out.println("Employee Deleted");
        }
        else {
            System.out.println("EmployeeNotFound");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        int choice;

        do {

            emp.viewMenu();

            System.out.print("Enter Choice: ");
            choice = emp.sc.nextInt();

            switch (choice) {

                case 1:
                    emp.addEmployee();
                    break;

                case 2:
                    emp.viewEmployee();
                    break;

                case 3:
                    emp.searchEmployee();
                    break;

                case 4:
                    emp.deleteEmployee();
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}
