package pkg7_advance_dsa.queue;

//Queue is a data structure, works on the FIFO principle:EX- 30<-20<-10
public class Queue {
    int size=0;
    Node head;
    Node top;

    //Node
    static class Node{
        Node prev;
        Object data;

        public Node(Object data){
            this.data = data;
        }
    }


    //push data in queue
    public void push(Object data){
        Node node = new Node(data);

        if (head==null){
            head=top=node;
        }else {
            node.prev = head;
            head=node;
        }
        size++;
    }

    //pop data from queue
    public Object pop(){
        if (isEmpty()){
            return null;
        }else {
            Object returnData = head.data;
            if (size==1){
                head = top = null;
            }else {
                head=head.prev;
            }
            size--;

            return returnData;
        }
    }

    //get last added data from queue
    public Object poll(){
        return head.data;
    }

    //search given element and return index
    public int search(Object data){
        int index=0;

        Node temp = head;
        while (temp!=null){
            if (temp.data==data){
                return index;
            }
            temp=temp.prev;
            index++;
        }

        return -1;
    }

    //check if queue is empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //display queue;EX-->30->20->10
    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print("->" + temp.data);
            temp=temp.prev;
        }
        System.out.println();
    }
}
