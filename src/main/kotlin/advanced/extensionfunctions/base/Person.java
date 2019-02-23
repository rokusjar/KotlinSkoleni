package advanced.extensionfunctions.base;

import java.time.LocalDateTime;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDateTime dateOfBirth;
    private final String address;

    public Person(String firstName, String lastName, LocalDateTime dateOfBirth, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getDateOfBirth() { return dateOfBirth; }

    public String getAddress() {
        return address;
    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private LocalDateTime dateOfBirth;
        private String address;

        public Builder() {
        }

        public Builder(Person person) {
            this.firstName = person.firstName;
            this.lastName = person.lastName;
            this.dateOfBirth = dateOfBirth;
            this.address = person.address;
        }

        public Builder firstName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder dateOfBirth(LocalDateTime dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, dateOfBirth, address);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
