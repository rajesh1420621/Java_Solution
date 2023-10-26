import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("A", "B", 1),
                new Employee("C", "B", 2),
                new Employee("D", "B", 3),
                new Employee("E", "B", 4)
        );

        Optional<Employee> max = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println("Maximum salary: " + max.get().getSalary());
    }
}
