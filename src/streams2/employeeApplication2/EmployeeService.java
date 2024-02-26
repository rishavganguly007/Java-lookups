package streams2.employeeApplication2;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    private final EmployeeFactory employeeFactory = new EmployeeFactory();

    public List<Employee> getAllEmployees(){
        return employeeFactory.getAllEmployee();
    }

    public void getAllDistinctProjects() {

        System.out.println("1. List all distinct project in non-ascending order.");
        List<Project> project = getAllEmployees()
                                    .stream()
                                    .map(Employee::getProjects)
                                    .flatMap(Collection::stream)
                                    .distinct()
                                    .sorted(Comparator.comparing(Project::getName))
                                    .toList();
        System.out.println(Arrays.toString(project.toArray()));
    }

    public void getAllNameStartsWith(String initial) {
        System.out.println("2. Print full name of any employee whose firstName starts with ‘A’");

        getAllEmployees()
                .stream()
                .filter(f -> f.getFirstName().startsWith(initial))
                .forEach(r -> System.out.println(r.getId() + " " + r.getFirstName() +  " " + r.getLastName()));

   }

    public void getEmployesJoinedInYear(String year) {
        System.out.println("3. List of all employee who joined in year 2023.");
        /*getAllEmployees()
                .forEach(r -> System.out.println(r.getId() + " " + r.getFirstName() +  " " + r.getLastName()));
        System.out.println("break");*/
        getAllEmployees()
                .stream()
                .filter(r ->
                    r.getId().startsWith(year))
                .distinct()
                .forEach(r -> System.out.println(r.getId() + " " + r.getFirstName() +  " " + r.getLastName()));
    }
}
