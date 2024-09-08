package pkg10_tricky_programs;

class Mutable {
    String s;

    Mutable(){}
    Mutable(String s){
        this.s = s;
    }

    public Mutable mutable(String s) {
        if (this.s != null && this.s.equals(s)) {
            return this;
        } else {
            return new Mutable(s);
        }

    }
}

public class P1_MutableClass {
    public static void main(String[] args) {
        Mutable m = new Mutable("Hello");

        Mutable m1 = m.mutable("Hi");
        Mutable m2 = m.mutable("Hi");

        System.out.println(m2==m1);


    }

}
