package training.daytwo.streams;

import training.methodref.Order;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {
        public static void main(String[] args){
        Employee empOne = new Employee(1,"Mani",28,150000,"Manager","IT");
        Employee empTwo = new Employee(2,"Binay",29,160000,"Senior Associate","IT");
        Employee empThree = new Employee(4,"Rahul",32,170000,"Senior Manager","Marketing");
        Employee empFour = new Employee(3,"Abhishek",24,80000,"Associate","Finance");
        Employee empFive = new Employee(5,"Rajesh",38,250000,"Director","IT");
        Employee empSix = new Employee(6,"Venkat",29,100000,"Associate","Admin");
        Employee empSeven = new Employee(4,"Ram",32,140000,"Senior Manager","Marketing");
        Employee empEight= new Employee(3,"Robert",24,110000,"Associate","Finance");


        //Optional<List<Employee>> empList = Optional.of(new ArrayList<Employee>());
                List<Employee> empList = new ArrayList<Employee>();
                empList.add(empOne);
                empList.add(empTwo);
                empList.add(empThree);
                empList.add(empFour);
                empList.add(empFive);
                //empList.add(null);
                empList.add(empSix);
                empList.add(empSeven);
                empList.add(empEight);

                System.out.println(empList);

                //Optional<List<Employee>> employeeList =empList;
                empList.stream().filter(o->o.getJobTitle().equals("Director")).forEach(System.out::println);

                boolean  allAssociates =  empList.stream().allMatch(o->o.getJobTitle().equals("Associate"));
                System.out.println(allAssociates);

                boolean  anyAssociate =  empList.stream().anyMatch(o->o.getJobTitle().equals("Associate"));
                System.out.println(anyAssociate);

                boolean  noneAssociate =  empList.stream().noneMatch(o->o.getJobTitle().equals("Executive"));
                System.out.println(noneAssociate);

                Optional<Employee> employees =  empList.stream().filter(o->o.getJobTitle().equals("Associate")).findAny();
                System.out.println(employees);

                empList.stream().filter(o->o.getJobTitle().equals("Executive")).findAny().ifPresent(System.out::println);
                empList.stream().filter(o->o.getJobTitle().equals("Manager")).findAny().ifPresent(System.out::println);
                empList.stream().filter(o->o.getJobTitle().equals("Associate")).findFirst().ifPresent(System.out::println);
                /**
                Stream<Employee> empStream = empList.stream().filter(o->o.getDept().equals("IT"));
                //empStream.anyMatch(o -> o.getJobTitle().equals("Executive"));
                empStream.forEach(System.out::println);
                empStream.anyMatch(o->o.getJobTitle().equals("Associate"));
                **/
                /**
                Supplier<Stream<Employee>> empStream = empList.stream().filter(o->o.getDept().equals("IT"));
                empStream.get().anyMatch(o->o.getJobTitle().equals("Associate"));
                 **/
                /**
                Supplier<Stream<String>> streamSupplier =Stream.of("a","b","c","d","e").filter(s-> s.startsWith("a"));
                streamSupplier.anyMatch(s-> s.startsWith("a"));
                streamSupplier.noneMatch(s–> s.startsWith("b"));
                **/

                Map<String, DoubleSummaryStatistics> salaryTotalByDept=empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summarizingDouble(Employee::getSalary)));
                System.out.println(salaryTotalByDept);

        }

}
