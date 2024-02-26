package streams.EmployeeApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockEmployeeData {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        // Create mock employees
        Employee employee1 = new Employee(1, "John", "Doe", "john.doe@example.com", "1234567890",
                LocalDate.of(2021, 1, 1), "Manager", 5000.0, null, null);
        Employee employee2 = new Employee(2, "Jane", "Smith", "jane.smith@example.com", "9876543210",
                LocalDate.of(2021, 2, 1), "Developer", 4000.0, 1, null);
        Employee employee3 = new Employee(3, "David", "Johnson", "david.johnson@example.com", "5555555555",
                LocalDate.of(2021, 3, 1), "Analyst", 3500.0, 1, null);

        // Set manager and department for employees
        employee1.setManagerId(null);
        employee1.setDepartment(new Department(1, "IT", null));
        employee2.setDepartment(new Department(2, "HR", null));
        employee3.setDepartment(new Department(3, "Finance", null));

        // Add employees to the list
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }
}

