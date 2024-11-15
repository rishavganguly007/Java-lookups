package streams.EmployeeApplication;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    MockEmployeeData employees = new MockEmployeeData();
    List<Employee> emp = MockEmployeeData.getEmployees();

    public void findSumOfSalary()
    {
        emp.stream().forEach(e -> System.out.println("Name " + e.getFirstName() + " Salary " + e.getSalary()));
        /*Double sum = emp.stream()
                .mapToDouble(e -> e.getSalary())
                .sum();
        System.out.println("total salary: " + sum);*/

        Double totalSalary =  emp.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println(totalSalary);

    }

    public void listDepartmentNameAndCount()
    {
       /*Map<String, Long> departmentCount =  emp.stream()
               .map(Employee::getDepartment)
               .collect(Collectors.groupingBy(Department::getDepartmentName, Collectors.counting()));

       departmentCount.forEach((departmentName, count) -> System.out.println(departmentName + ": " + count ));*/
        Map<String, Long> deptName =  emp.stream()
                                    .map(Employee :: getDepartment)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Department::getDepartmentName, Collectors.counting()));
        deptName.forEach((name, count) -> System.out.println(name + count));

    }

    public void findSeniorMostEmployee()
    {
        /*Optional<Employee> e = emp.stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));

        if(e.isPresent())
        {
            Employee seniorEmp = e.get();
            System.out.println("Name: " + seniorEmp.getFirstName() + " " + "HireDate: " + seniorEmp.getHireDate());
        }*/

        Optional<Employee> e  = emp.stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));
        e.ifPresent(System.out::println);
    }

    public void findEmpNameAndDuration()
    {
        /*List<String> e = emp.stream()
                .map(em ->{
                    String name = em.getFirstName();
                    LocalDate hireDate = em.getHireDate();
                    Period period = Period.between(hireDate, LocalDate.now());
                    int month = period.getMonths();
                    int day = period.getDays();
                    return "Name : " + name + ", Duration: " + month + " months " + day + " days";
                })
                .collect(Collectors.toList());
        e.forEach(System.out :: println);*/
    }

    public void sortByEmpId()
    {
        /*emp.stream()
                .sorted((e1, e2) -> (e1.getEmployeeId().compareTo(e2.getEmployeeId())))
                .forEach(e -> System.out.println("ID : " + e.getEmployeeId() + " Name: " + e.getFirstName()));

        System.out.println("In Reverser Order");

        emp.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeId).reversed())
                .forEach(e -> System.out.println("ID : " + e.getEmployeeId() + " Name: " + e.getFirstName()));*/
    }

    public void sortByDeptId()
    {
        /*emp.stream()
                .map(Employee::getDepartment)
                .sorted(Comparator.comparing(Department::getDepartmentId))
                .forEach(d -> System.out.println("Dept Id: " + d.getDepartmentId() + " Name : " + d.getDepartmentName()));*/

        emp.stream()
                .map(Employee::getDepartment)
                .flatMap(Collection :: stream)
                .sorted(Comparator.comparing(Department::getDepartmentId))
                .forEach(System.out :: println);
    }

    public void sortByName()
    {
        /*emp.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .forEach(e -> System.out.println("Name : " + e.getFirstName() + " " + e.getLastName()));*/
        emp.stream()
                .sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
                .forEach(System.out::println);

    }

    public void FindNthHighestSalary(Integer n) {
        if (n > emp.size())
        {
            System.out.println("N > total Employes");
            return;
        }

        Employee em = emp.stream()
                            .sorted(Comparator.comparing(Employee::getSalary))
                            .skip(n)
                            .findFirst()
                            .get();
        System.out.println(em);
    }

    public void getAverageSalaryOfEachDept() {
        //Map<String, Double> collect = list.stream()
        //    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
        //System.out.println("Average rank in all departments  : "+collect);
    }
}
