import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String [] args) {
        Employee e1 = new Employee("John", "Doe", "123 street", "123-123-1234", "1111", LocalDate.of(1111,11,1));
        System.out.println(e1.toString());
    }
}
