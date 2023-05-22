package src.exceptionHandling;

public class MainExceptionApplication {
    public static void main(String[] args) throws EmployeeNameException {
        String fname = "";
        if(fname.isBlank())
        {
            throw new EmployeeNameException("Empty fname");
        }
    }
}
