package streams.questions;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class QuestionsOnCustomObjects {

    public static void main(String[] args) {

        //sort employees based on salary
        System.out.println("sorted based on salary");
        DataCreator.getData().stream().sorted(Comparator.comparing(Employee::getSalary)).toList().forEach(
                System.out::println
        );


        //reverse order of salary
        DataCreator.getData().sort(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)));

        //group by department
        Map<String,List<Employee>> gd=DataCreator.getData().stream()
                .collect(Collectors.groupingBy(Employee::getDepartement));
        System.out.println("Printing by department");
        System.out.println(gd);
        System.out.println("--------------------------------------");

        //average salary in each department
        Map<String,Double> da=DataCreator.getData().stream()
                .collect(Collectors.groupingBy(Employee::getDepartement,Collectors.averagingLong(Employee::getSalary)));
        System.out.println("Average salary in each departement");
        System.out.println(da);
        System.out.println("---------------------------------------");

        //count number of employees by age and sort the age

        Map<Integer,Long> ea=DataCreator.getData().stream().collect(Collectors.groupingBy(Employee::getAge,TreeMap::new,Collectors.counting()));
        System.out.println("Number of employess for each age");
        System.out.println(ea);

        //minimum or maximum salary in each department

        Map <String, Optional<Employee>> sd=DataCreator.getData().stream().collect(Collectors.groupingBy(Employee::getDepartement,Collectors.maxBy((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))));

        System.out.println("Minimu salary in each department");
        System.out.println(sd);

        //summary of the each department  for salary
        Map<String ,LongSummaryStatistics> ss= DataCreator.getData().
                stream()
                .collect(Collectors.groupingBy(Employee::getDepartement, Collectors.summarizingLong(Employee::getSalary)));

    ss.forEach((key, value) -> System.out.println(key + " " + value.getAverage()));
    }
}
