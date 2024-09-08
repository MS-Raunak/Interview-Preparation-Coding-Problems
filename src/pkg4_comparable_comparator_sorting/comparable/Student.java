package pkg4_comparable_comparator_sorting.comparable;
//Sort collection of object on single attriute
public class Student implements  Comparable<Student>{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        //comparing current field and next field
        //return this.id - student.id; //sorting based on id
        //return Integer.compare(this.age, student.age); //sorting based on age
        return this.name.compareTo(student.name); //sorting based on name
    }
}
/**
 * By using Comparable we can sort collection of objects based on single attribute
 * We arite code in current class in case of Comparable
 * compareTo method we can override to sort.
 * To sort alphabetically we use compareTo method
 */
