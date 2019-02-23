package advanced.extensionfunctions;

import advanced.extensionfunctions.base.Employee;
import advanced.extensionfunctions.base.Person;

import java.time.LocalDateTime;

public class ExFunctionsJava {

    public static Employee createEmployee(Person person, String position) {
        Employee employee = new Employee();
        employee.setFullName(person.getFirstName() + " " + person.getLastName());
        employee.setAge(LocalDateTime.now().getYear()  - person.getDateOfBirth().getYear());
        employee.setPosition(position);
        return employee;
    }

    public static void fillPositionIfMissing(Employee employee, String position) {
        if (employee.getPosition() == null || employee.getPosition().isEmpty()) {
            employee.setPosition(position);
        }
    }

    public static void initPerson() {
        Person person = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .dateOfBirth(LocalDateTime.now().minusYears(32))
                .address("Radlická 714/113 Praha 5")
                .build();
    }

    public static void printAddressIfNotNull(Person person) {
        String address = person.getAddress();
        if (address != null) {
            System.out.println(address);
        }
    }


}
