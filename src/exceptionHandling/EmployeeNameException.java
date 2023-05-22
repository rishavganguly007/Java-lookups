package src.exceptionHandling;

public class EmployeeNameException extends Exception{
    EmployeeNameException(){
        super();
    }
    EmployeeNameException(String msg)
    {
        super(msg);
    }
}
