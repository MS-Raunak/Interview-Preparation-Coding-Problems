package pkg7_advance_dsa.queue;

import pkg7_advance_dsa.stack.Node;

public class QueueDriver {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        queue.display();

        //System.out.println(queue.pop());
        //System.out.println(queue.pop());
        //System.out.println(queue.pop());

        //System.out.println(queue.poll());

        System.out.println(queue.search(30));
    }
}
