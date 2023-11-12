package streams.questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfCharacters{
    public static void main(String[] args) {
        String s1 = "AccesssesssDer";

        Map<String,Long> x=Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(x);
    }


}
