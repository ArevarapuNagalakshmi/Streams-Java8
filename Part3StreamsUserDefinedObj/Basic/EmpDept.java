package Streams.Part3StreamsUserDefinedObj.Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmpDept{
    public static void main(String[] args) {
        List<Employee1> employee = Arrays.asList(
                new Employee1("abc", 90000, 1, "Bengaluru", "HR"),
                new Employee1("bc", 90000, 1, "Bengaluru", "Manager"),
                new Employee1("bca", 80000, 2, "HYD", "developer"),
                new Employee1("nmc", 70000, 3, "Bengaluru", "Designer"),
                new Employee1("anjnc", 60000, 4, "Hariyana", "Team Lead"),
                new Employee1("ahdc", 50000, 5, "Marathalli", "Account holder"),
                new Employee1("jyyc", 4000, 6, "Balendhur", "Teacher"),
                new Employee1("ajdcdjdjc", 30000, 7, "White field", "Associate Software developer"));

//        Optional<Employee1> a = employee.stream()
//                .filter(e -> e.getDepartment().equals("HR"))
//                .findFirst();
//
//        a.ifPresent(System.out::println);

//        if (a.isPresent()) {
//            Employee1 emp = a.get();
//            System.out.println(emp);
//        } else {
//            System.out.println("No employee found");
//        }

        Employee1 emp=employee.stream()
                .filter(e -> e.getDepartment().equals("HR"))
                .findFirst()
                .orElseThrow(()->new RuntimeException());
        System.out.println(emp);
    }
}
