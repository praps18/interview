package streams.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class StringListQuestions {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("Hleoo","ganesh","krishna","prapul");
        l1.stream().map(String::toLowerCase).forEach(System.out::println);//to make every word to lower case
        l1.stream().filter(s->s.startsWith("H")).forEach(System.out::println);
        List<Employee> e=DataCreator.getData();

        e.stream().filter(z->z.getName().startsWith("j")).forEach(System.out::println);

        e.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);


        TreeMap<String,List<String>> dict=new TreeMap<>();


    }
}
