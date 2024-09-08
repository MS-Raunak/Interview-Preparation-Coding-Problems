package pkg6_java8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ram", 20000d, "M", LocalDate.of(2013, 5, 10), "Developer");
        Employee emp2 = new Employee("Sita", 3000d, "F", LocalDate.of(2009, 2, 15), "HR");
        Employee emp3 = new Employee("Krishna", 5000d, "M", LocalDate.of(2019, 7, 01), "Manager");
        Employee emp4 = new Employee("Gita", 8000d, "F", LocalDate.of(2024, 3, 20), "HR");

        List<Employee> employees = Arrays.asList(emp1,emp2,emp3,emp4);

        sortEmployeeBasedOnName(employees);
        averageSal(employees);
        averageSalOfMale(employees);
        findEmpWithJoinYr(employees, 2009);
        highestSal(employees);
        employeesInSpecificDepartment(employees, "HR");
        totalEmployeesInSpecificDepartment(employees, "HR");
        totalEmpsInOrg(employees);
        totalFemaleEmpsInOrg(employees);
        incrementSalOfHRs(employees);
        oldestEmployee(employees);
        youngestEmployee(employees);

    }

    private static void sortEmployeeBasedOnName(List<Employee> employees) {
        //List<Employee>employeeList = employees.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).toList();
        List<Employee>employeeList = employees.stream().sorted(Comparator.comparing(Employee::getName)).toList();
        System.out.println(employeeList);
    }

    //Average sal of employees
    public static void averageSal(List<Employee> employees){
         double avgSal = employees.stream().mapToDouble(emp->emp.getSal()).average().getAsDouble();
        System.out.println("Average Sal of all emps: " + avgSal);
    }

    //Average sal of male employees
    public static void averageSalOfMale(List<Employee> employees){
        double avgSal = employees.stream()
                        .filter(emp->emp.getGender()
                        .equals("M"))
                        .mapToDouble(Employee::getSal)
                        .average()
                        .orElse(0.0);
        System.out.println("Average Sal of male emp: " + avgSal);
    }

    //Find employee who joined in specific year
    private static void findEmpWithJoinYr(List<Employee> employees, Integer joiningYr) {
        List<Employee> filterEmployees = employees.stream()
                        .filter(emp -> emp.getJoinDate()
                        .getYear()==joiningYr)
                        .toList();

        //System.out.println(filterEmployees);
        System.out.println(filterEmployees);
    }

    //Find employee with the highest salary
    private static void highestSal(List<Employee> employees){
        Optional<Employee> highestPaidEmployee = employees.stream()
                //.max(Comparator.comparingDouble(Employee::getSal));
                        .reduce((e1,e2)-> e1.getSal() > e2.getSal() ? e1 : e2);
        System.out.println(highestPaidEmployee.get());
    }

    //List of employees working in specific department
    public static void employeesInSpecificDepartment(List<Employee> employees, String department){
        List<Employee> filteredEmployees = employees.stream().filter(e->e.getDept().equals(department)).toList();
        System.out.println(filteredEmployees);
    }

    //Find total number of employees in specific department
    public static void totalEmployeesInSpecificDepartment(List<Employee> employees, String department){
        long totalEmpInSpecificDept = employees.stream().filter(e->e.getDept().equals(department)).count();
        System.out.println("Total employees working in " + department + " department: " + totalEmpInSpecificDept);
    }

    //Find total employee working in org
    public static void totalEmpsInOrg(List<Employee> employees){
        long totalEmp = employees.size();
        System.out.println("Total employees: " + totalEmp);
    }

    //Find total employee working in org
    public static void totalFemaleEmpsInOrg(List<Employee> employees){
        List<Employee> totalEmp = employees.stream().filter(e->e.getGender().equals("F")).toList();
        System.out.println("Total female employees:" + totalEmp);
    }


    //Increment sal of employees who are working in HR department
    public static void incrementSalOfHRs(List<Employee> employees){
        employees.stream().filter(e->e.getDept().equals("HR")).forEach(e->e.setSal(e.getSal()*1.10));

        System.out.println(employees);
    }

    //oldest employee in the organization
    public static void oldestEmployee(List<Employee> employees){
     Employee employee = employees.stream()
             .reduce((e1,e2)->e1.getJoinDate().getYear() < e2.getJoinDate().getYear() ? e1:e2).get();
        System.out.println("Oldest emp: " + employee);
    }

    //youngest employee in the organization
    public static void youngestEmployee(List<Employee> employees){
        Employee employee = employees.stream()
                .reduce((e1,e2)->e1.getJoinDate().getYear() > e2.getJoinDate().getYear() ? e1:e2).get();
        System.out.println("Youngest emp: " + employee);
    }
}
