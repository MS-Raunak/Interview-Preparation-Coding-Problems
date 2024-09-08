package pkg4_comparable_comparator_sorting.comparable;

import java.util.Arrays;


public class Driver {
    public static void main(String[] args) {
        Student student = new Student(5, "Ritesh", 21);
        Student student1 = new Student(2, "ZChhaya", 3);
        Student student2 = new Student(25, "Jaan Babu", 18);
        Student student3 = new Student(15, "Jaya", 36);
        Student student4 = new Student(1, "Geneliya", 12);

        /*
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Collections.sort(students);

        for (Student s : students)
            System.out.println(s);

         */

        Student[] students = {student, student1, student2, student3, student4};
        Arrays.sort(students);

        for (Student s : students)
            System.out.println(s);
    }
}
