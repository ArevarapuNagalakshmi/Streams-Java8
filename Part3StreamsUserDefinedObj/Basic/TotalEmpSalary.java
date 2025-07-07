package Streams.Part3StreamsUserDefinedObj.Basic;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class TotalEmpSalary {
    public static void main(String[] args) {

        List<Employee1> emp = Arrays.asList(
                new Employee1("abc", 90000, 1, "Bengaluru", "HR"),
                new Employee1("bc", 90000, 1, "Bengaluru", "Manager"),
                new Employee1("bca", 80000, 2, "HYD", "developer"),
                new Employee1("nmc", 70000, 3, "Bengaluru", "Designer"),
                new Employee1("anjnc", 60000, 4, "Hariyana", "Team Lead"),
                new Employee1("ahdc", 50000, 5, "Marathalli", "Account holder"),
                new Employee1("jyyc", 4000, 6, "Balendhur", "Teacher"),
                new Employee1("ajdcdjdjc", 30000, 7, "White field", "Associate Software developer")
        );
        double employee = emp.stream()
                .filter(a -> a.getDepartment().equals("Account holder"))
                .mapToDouble(a -> a.getSalary())
                //  .mapToDouble(Employee1::getSalary)
                .sum();
        System.out.println(employee);

             double total=emp.stream()
                .filter(a->a.getDepartment().equals("Manager"))
                        .mapToDouble(a->a.getSalary())
                         .sum();
        System.out.println(total);

    }
}
