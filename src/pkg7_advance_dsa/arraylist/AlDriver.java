package pkg7_advance_dsa.arraylist;

public class AlDriver {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);

        //list.add(3, 50);

        list.display();

        //list.remove();
        //list.display();

        //list.remove(2);
        //list.display();

        list.removeVal(10);
        list.display();
    }
}
