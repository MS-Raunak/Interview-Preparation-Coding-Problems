package pkg7_advance_dsa.linkedlist_singly;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int count=0;

    //Return size of the list
    public int size() {
        return count;
    }

    //Add data at ending
    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
            count++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        count++;
    }

    //Add data at beginning
    public void addFirst(Object data) {
        if (head==null){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
        count++;
    }

    //Add data at given index
    public void addAt(Object data, int index) {
        if (index<0 || index>size()) {
            System.out.println("Index Out Of Index");
            return;
        }
        else if (index==0){
            addFirst(data);
            return;
        }
        else if (index==size()){
            addLast(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);

        for (int i=0; i<index-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
    }

    //Remove from last
    public Object remove() {
        Object deletedData=null;
        if (head!=null) {
            deletedData = tail.data;
            Node temp = head;

            while (temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            count--;
        }
        return deletedData;
    }

    //Remove From Beginning
    public void removeFirst(){
        if (size()<1){
            System.out.println("list is empty!!");
            return;
        }
        head=head.next;
        count--;
    }

    //Remove given data
    public void remove(Object data) {
        if (size()<1) {
            System.out.println("list is empty already!!");
            return;
        }
        else if (head.data==data) { //if data present on first index
            head=head.next;
            return;
        }
        else if (tail.data==data){ //if data present on last index
            remove();
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            if (temp.next.data==data){
                temp.next = temp.next.next;
                count--;
                return;
            }
            temp=temp.next;
        }
        //if data not found in this list
        System.out.println(data + " is not Found in the list");
    }

    //Remove data from given index
    public Object removeAt(int index) {
        if (index < 0 || index >=size()){
            System.out.println("Invalid index");
            return null;
        }
        else if (index==0){
            removeFirst();
            return head.data;
        }
        else if (index==size()-1){
            remove();
            return tail.data;
        }

        Node temp = head;
        for (int i=0; i<index-1; i++) {
            temp=temp.next;
        }
        Object deletedData = temp.next.data;
        temp.next = temp.next.next;
        return deletedData;
    }

    //Print first data in the list
    public Object getFirst(){
        return head.data;
    }

    //Print Last data in the list
    public Object getLast(){
        return tail.data;
    }

    //Print given index data in the list
    public Object getAt(int index){
        if (index<0 || index>=size()){
            System.out.println("Invalid index!!");
            return null;
        }
        if (index==0){
            return getFirst();
        }
        else if (index==size()-1){
            return getLast();
        }

        //traversing temp(head) until the previous index of the given index
        Node temp = head;
        for (int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    //Find index of given data
    public int indexOf(Object data) {
        Node temp = head;
        int index=0;
        while (temp!=null){
            if (temp.data==data){
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    //Print LinkedList
    public void print(Node head) {
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Print list in reverse order without using recursion
    public void reversed(Node head){
        Node temp = head;
        if (temp==null) return;
        reversed(temp.next);
        System.out.print(temp.data + ", ");
    }


    //Print in reverse Order
    public void reverseWithoutRec(Node head){
        Node current = head;
        Node prev = null;

        while (current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        print(prev);
    }
}
