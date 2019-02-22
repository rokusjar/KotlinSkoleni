package advanced.extensionfunctions;

import advanced.extensionfunctions.base.Employee;
import advanced.extensionfunctions.base.Person;

import java.time.LocalDateTime;

public class ExFunctionsJava {

    public static void initPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(24);
        person.setDateOfBirth(LocalDateTime.now().minusYears(24));
        person.setAddress("Radlická 714/113 Praha 5");
    }

    public static void fillFirstNameIfMissing(Person person, String name) {
        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            person.setFirstName(name);
        }
    }

    public static Employee createEmployee(Person person, String position) {
        Employee employee = new Employee();
        employee.setFullName(person.getFirstName() + " " + person.getLastName());
        employee.setAge(person.getAge());
        employee.setPosition(position);
        return employee;
    }

    public static void printAddressIfNotNull(Person person) {
        String address = person.getAddress();
        if (address != null) {
            System.out.println(address);
        }
    }


}
