package pkg7_advance_dsa.stack;


//Stack: Linear Data Structure worked on LIFO principle
public class Stack {
    Node head;       
    Node top;       
    int size=0;

    //get size of stack
    public int size(){
        return size;
    }

    //add data at the end position
    public void push(Object data) {
        //head->10->20->30->top
        Node newNode = new Node(data);

        if (head==null){
            head=top = newNode;
        }
        else {
            top.next = newNode;
            top = newNode;
        }
        size++;
    }

    //remove early inserted data
    public Object pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }

        Object returnData = top.data;

        if (head==top){

            return head.data;

        }else {

            Node temp = head;
            while (temp.next != top) {
                temp = temp.next;
            }
            temp.next = null;
            top = temp;
        }
        size--;

        return returnData;
    }

    //peek last element from stack
    public Object peek(){
        return top.data;
    }

    //search given element index number
    public int search(Object data){
        Node temp = head;
        int index=0;
        while (temp!=null){
            if (temp.data==data){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    //check if stack is empty or not
    public boolean isEmpty(){
        return size==0;
    }

    //10->20->30: displaying stack data(there is no any display method in stack)
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }
}
