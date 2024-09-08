package pkg6_java8;

import java.time.LocalDate;

public class Employee {
    String name;
    double sal;
    String gender;
    LocalDate joinDate;
    String dept;

    public  Employee(String name, Double sal, String gender, LocalDate joinDate, String dept){
        this.name = name;
        this.sal = sal;
        this.gender = gender;
        this.joinDate = joinDate;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public double getSal() {
        return sal;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString(){
        return "{" + this.name + " , " + this.sal + " , " + this.gender + " , " + this.joinDate + " , " + this.dept + "}";
    }

}
