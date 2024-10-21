package pkg7_advance_dsa.stack;

public class Driver {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        //System.out.println(stack.pop());

        //System.out.println(stack.peek());

        System.out.println(stack.search(20));


    }
}
