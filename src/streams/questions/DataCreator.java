package streams.questions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DataCreator {
    public static List<Employee> getData(){

        Employee e1=new Employee(21,"ganesh","IT",20000L,"hyderabad","Engineer");
        Employee e2=new Employee(55,"walter","IT",30000L,"hyderabad","Engineer");

        Employee e3=new Employee(21,"jesse","IT",30000L,"hyderabad","Engineer");
        Employee e4=new Employee(42,"oppenheimer","IT",2500L,"Banglore","Engineer");
        Employee e5=new Employee(26," ","Security",60000L,"hyderabad","Engineer");
        Employee e7=new Employee(29,"ganesh","Security",20000L,"hyderabad","Engineer");
        Employee e8=new Employee(21,"sai","IT",80000L,"pune","Engineer");
        Employee e9=new Employee(21,"kiran","IT",20000L,"banglore","Engineer");
        Employee e10=new Employee(24,"vamsi","Production",20000L,"hyderabad","Engineer");
        Employee e11=new Employee(24,"krishna","Support",20000L,"hyderabad","Engineer");
        Employee e13=new Employee(40,"rey","Management",880000L,"delhi","Engineer");
        Employee e12=new Employee(24,"poe","Support",20000L,"hyderabad","Engineer");
        Employee e6=new Employee(24,"vader","Management", 77770000L,"hyderabad","Engineer");

        List<Employee> dummyData= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13);
        return dummyData;


    }
}
