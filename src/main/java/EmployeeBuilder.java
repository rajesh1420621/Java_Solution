public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private int salary;

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(firstName, lastName, salary);
    }
}