package streams2.employeeApplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        EmployeeService emplService = new EmployeeService();
        // 0. Get all Employees
        //System.out.println(emplService.getAllEmployees());

        // 1. List all distinct project in non-ascending order.
        emplService.getAllDistinctProjects();

        // 2. Print full name of any employee whose firstName starts with ‘A’.
        emplService.getAllNameStartsWith("A");

        //3. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
        emplService.getEmployesJoinedInYear("2023");
    }
}
