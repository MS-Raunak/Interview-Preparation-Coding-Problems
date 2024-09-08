package pkg7_advance_dsa.linkedlist_doubly;

public class DoublyLinkedList {
    Node head; //pointing to the first node
    Node tail; //pointing to the last node
    int count=0;

    //Get size of the list
    public int size() {
        return count;
    }

    //Print data of the list
    public void print(Node head){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

        //New Line
        System.out.println();
    }

    //Add data at the ending index
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            count++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        count++;
    }

    //Add data in the list at beginning
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            count++;
            return;
        }
        head.prev=newNode;
        newNode.next = head;
        head=newNode;
        count++;
    }


    //Add data in the list at given index
    public void addAt(int index, Object data) {
        if (index<0 || index >=size()){
            System.out.println("Invalid index");
            return;
        }
        else if (index==0 || head==null){
            addFirst(data);
            return;
        }

        //Iterate temp until  index-1
        Node temp = head;
        for (int i=0; i<index-1; i++) {
            temp=temp.next;
        }

        Node newNode = new Node(data); //creating new node

        newNode.next = temp.next;//temp ka agla newNode ka agla hoga
        temp.next=newNode;       //now next node of temp will be newNode
        newNode.prev = temp;     //temp will be previous node of newNode
        count++;
    }

    //Remove node From Last Index
    public void remove() {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
       else if (head==tail){ // Only one element in the list
            head=tail=null;
            count--;
            return;
       }
        tail=tail.prev;
        tail.next=null;
        count--;
    }

    //Remove from beginning
    public void removeFirst(){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        else if (head==tail){// Only one element in the list
            head=tail=null;
            count--;
            return;
        }
        head=head.next;
        head.prev=null;
        count--;
    }

    //Remove from given index
    public void removeAt(int index) {
        if (index < 0 || index>=size()){        //when index is OutOfBound
            System.out.println("Invalid index");
            return;
        }
        else if (index==0 && head==tail){
            head=tail=null;
            count--;
            return;
        }
        else if (index == 0){ //
            head = head.next;
            head.prev = null;
            count--;
        }
        else if (index==size()-1){
            tail = tail.prev;
            tail.next=null;
            count--;
            return;
        }

        Node temp = head;
        for (int i=0; i<index-1; i++) {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        count--;
    }

    //Remove given Object
    public void remove(Object data) {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        else if (head.data == data && head==tail){//only one data in the list with same given data
            head=tail=null;
            count--;
            return;
        }
        else if (tail.data==data){
            tail=tail.prev;
            tail.next=null;
            return;
        }
        else if (head.data ==data){//first data is same as given data
            head=head.next;
            head.prev=null;
            count--;
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            if (temp.next.data==data){
                temp.next=temp.next.next;
                temp.next.prev = temp;
                count--;
                return;
            }
            temp=temp.next;
        }
        System.out.println("Given data not found");
    }

    //Check whether the list is empty or not
    public boolean isEmpty() {
        return count==0;
    }

    //Clear the list
    public void clear() {
        head=tail=null;
        //System.out.println("list has been cleared!!");
    }

    //Reverse the list
    public void reversed() {
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        while (tail!=null){
            System.out.print(tail.data + " ");
            tail=tail.prev;
        }
        //Adding new line
        System.out.println();
    }

    //Get first data
    public Object getFirst() {
        return head.data;
    }

    //Get last data
    public Object getLast() {
        return tail.data;
    }

}
