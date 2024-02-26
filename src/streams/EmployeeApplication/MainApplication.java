package streams.EmployeeApplication;

public class MainApplication {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.findSumOfSalary();
        employeeService.listDepartmentNameAndCount();
        employeeService.findSeniorMostEmployee();
        employeeService.findEmpNameAndDuration();
        employeeService.sortByEmpId();
        employeeService.sortByDeptId();
        employeeService.sortByName();
    }
}
