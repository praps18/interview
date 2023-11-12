package streams.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberQuestions {
    public static void main(String[] args) {

        //array declaration
        int a[]=new int[10];

        int arr[]={28,22,11,33,555,7777,99,332,98,9,34,56,78,90,9,23,76,8757};

        List<Integer> l1=Arrays.asList(1,2,3,4,5,6);
        List<Integer> l2=Arrays.asList(4,5,6,78,8);
        HashSet<Integer> h1=new HashSet<>(l1);
        l2.forEach(n->{
            if(!h1.add(n)){
                System.out.println(n);
            }
        });
        System.out.println("------------------------------------------------------------");
        //average of the array
        System.out.println("Avearge of the array ");
        Double avg= Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);

        //sort the array
        System.out.println("Sorting of the array");
        Arrays.stream(arr).sorted().forEach(System.out::println);

        //reverse order sorting
        System.out.println("reverse order sorting");
        Arrays.sort(Arrays.stream(arr).boxed().toArray(),Collections.reverseOrder());

        //distinct elements of an array
        System.out.println("distinct elemnts of an array");
        Arrays.stream(arr).distinct().forEach(System.out::println);

        Arrays.stream(arr).max().getAsInt();//max of the array

        Arrays.stream(arr).min().getAsInt();//min of the array



    }
}
