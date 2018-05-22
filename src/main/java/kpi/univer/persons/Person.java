package kpi.univer.persons;

import kpi.univer.units.Unit;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Person {
    protected final String firstName;
    protected final String lastName;
    protected Date dateOfBirth;
    protected Sex sex;
    protected Adress adress;


    public Person(String firstName, String lastName, Sex sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Sex getSex() {
        return sex;
    }

    public Adress getAdress() {
        return adress;
    }

    public enum Sex{
        MALE, FEMALE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, dateOfBirth, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                '}';
    }
}
