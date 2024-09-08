package pkg10_tricky_programs;

import pkg6_java8.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public final class Test{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram", 20000d, "M", LocalDate.of(2013, 5, 10), "Developer");
        Employee emp2 = new Employee("Sita", 3000d, "F", LocalDate.of(2009, 2, 15), "HR");
        Employee emp3 = new Employee("Krishna", 5000d, "M", LocalDate.of(2019, 7, 01), "Manager");
        Employee emp4 = new Employee("Gita", 8000d, "F", LocalDate.of(2024, 3,07),"HR");

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3,emp4);
        

//       Double sal = employees.stream().mapToDouble(Employee::getSal).average().getAsDouble();
//        System.out.println(sal);

//        Double sal = employees.stream().filter(e->e.getGender()=="F").mapToDouble(Employee::getSal).average().getAsDouble();
//        System.out.println(sal);

//        Long totalEmps = employees.stream().count();
//        System.out.println(totalEmps);

//        List<Employee> empJoinedInSpecificYr = employees.stream().filter(e->e.getJoinDate().getYear()==2009).toList();
//        System.out.println(empJoinedInSpecificYr);

//        Long totalFemaleEmps = employees.stream().filter(e->e.getGender()=="F").count();
//        System.out.println(totalFemaleEmps);

//        Double totalSal = employees.stream().map(Employee::getSal).reduce(Double::sum).get();
//        System.out.println(totalSal);

//        String oldestEmployee = employees.stream().reduce((e1,e2) -> e1.getJoinDate().getYear() < e2.getJoinDate().getYear()?e1:e2).get().getName();
//        System.out.println(oldestEmployee);

//        String youngestEmployee = employees.stream().reduce((e1,e2) -> e1.getJoinDate().getYear() > e2.getJoinDate().getYear()?e1:e2).get().getName();
//        System.out.println(youngestEmployee);

         employees.stream().filter(e->e.getDept()=="HR").forEach(e->e.setSal(e.getSal()*1.10));
        System.out.println(employees);
    }


}


