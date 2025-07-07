package Streams.Part3StreamsUserDefinedObj.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class Employee1{
    private String name;
    private double salary;
    private int id;
    private String city;
    private String department;

    public Employee1(String name, double salary, int id, String city, String department) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.city = city;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class EmpGreaterValue {
    public static void main(String[] args) {
        List<Employee1>emp= Arrays.asList(new
                        Employee1("abc",90000,1,"Bengaluru","HR"),
                new Employee1("bc",90000,1,"Bengaluru","Manager"),
                new Employee1("bca",80000,2,"HYD","developer"),
                new Employee1("nmc",70000,3,"Bengaluru","Designer"),
                new Employee1("anjnc",60000,4,"Hariyana","Team Lead"),
                new Employee1("ahdc",50000,5,"Marathalli","Account holder"),
                new Employee1("jyyc",4000,6,"Balendhur","Teacher"),
                new Employee1("ajdcdjdjc",30000,7,"White field","Associate Software developer"));
        Predicate<Employee1>pre= p->p.getSalary()>1000;
        emp.stream()
                .filter(pre)
                .forEach(System.out::println);

    }
}
