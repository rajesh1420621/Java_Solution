import java.util.Optional;

public class Main27thOct2023 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setHouseNo(1);
        address.setStreetName("Any street");
        Employee employee = new Employee();
        employee.setFirstName("First Name");
        employee.setLastName("Last Name");
        employee.setSalary(1000);
        employee.setAddress(address);
        System.out.println("****************************");
        System.out.println(Optional.ofNullable(employee.getAddress()).map(Address::getStreetName).orElse("Null value"));
    }
}
