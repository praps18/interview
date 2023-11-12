package streams.questions;

import java.math.BigDecimal;

public class Employee {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(int age, String name, String departement, Long salary, String city, String designation) {
        this.age = age;
        this.name = name;
        this.departement = departement;
        this.salary = salary;
        this.city = city;
        this.designation = designation;
    }

    private String departement;
    private Long salary;

    private String city;

    private String designation;

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", departement='" + departement + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
