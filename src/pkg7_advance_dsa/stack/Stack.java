package pkg7_advance_dsa.stack;

public class Stack {
    Node first;       //first in
    Node last;       //last out
    int size=0;

    public int size(){
        return size;
    }

    public void push(Object data) {
        Node newNode = new Node(data);
        if (first==null){
            first=last = newNode;
            size++;
        }
        else {
            last.next = newNode;
            last = newNode;
            size++;
        }
    }

    //remove early inserted data
    public Object pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        if (size()==1){
            return first.data;
        }
        Object returnData = last.data;
        Node temp = first;
        for (int i=0; i<size-1; i++){
            temp=temp.next;
        }
        temp.next = last;
        last=temp;
        return returnData;
    }
    //public Object peek(){}
    //public int search(Object data){}
    public boolean isEmpty(){
        return size==0;
    }
}
