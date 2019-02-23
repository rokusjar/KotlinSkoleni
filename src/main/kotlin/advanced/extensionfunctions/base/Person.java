package advanced.extensionfunctions.base;

import java.time.LocalDateTime;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private LocalDateTime dateOfBirth;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class Builder {

        private Person person;

        public Builder(String firstName) {
            person = new Person();
            person.setFirstName(firstName);
        }

        public Builder withLastName(String lastName) {
            person.setLastName(lastName);
            return this;
        }

        public Builder withAge(Integer age) {
            person.setAge(age);
            return this;
        }

        public Builder withAddress(String address) {
            person.setAddress(address);
            return this;
        }

        public Builder withDateOfBirth(LocalDateTime dateOfBirth) {
            person.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Person build() {
            return person;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
