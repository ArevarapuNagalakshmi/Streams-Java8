package Streams.Part3StreamsUserDefinedObj.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class Employee{
    private String name;
    private double salary;
    private int id;
    private String city;
    private String department;

    public Employee(String name, double salary, int id, String city, String department) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.city = city;
        this.department = department;
    }

    public Employee() {
        super();
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
public class EmpSpecCityGetCount {
    public static void main(String[] args) {
        List<Employee>emp= Arrays.asList(new Employee("abc",9000,1,"Bengaluru","HR"),
                new Employee("bc",9000,1,"Bengaluru","Manager"),
                new Employee("bca",8000,2,"HYD","developer"),
                new Employee("nmc",7000,3,"Bengaluru","Designer"),
                new Employee("anjnc",6000,4,"Hariyana","Team Lead"),
                new Employee("ahdc",5000,5,"Marathalli","Account holder"),
                new Employee("jyyc",4000,6,"Balendhur","Teacher"),
                new Employee("ajdcdjdjc",3000,7,"White field","Associate Software developer"));
        Predicate<Employee>pre=p->p.getCity().equals("Bengaluru");
        emp.stream()
                .filter(pre)
                .forEach(System.out::println);

        long count=emp.stream()
                .filter(pre)
                .count();
        System.out.println(count);

    }
}
