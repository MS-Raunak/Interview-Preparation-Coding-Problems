package pkg7_advance_dsa.linkedlist_circullar;

public class CircullarLinkedList {
    Node head;
    Node tail;

    int count=0;

    //Get size of the list
    public int size(){
        return count;
    }

    //Printing data of the circullar list
    public void print() {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        while (temp!=head);  // Loop until we come back to the head
        //Add newLine
        System.out.println();
    }

    //Add data at end
    public void add(Object data) {
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        count++;
    }

    //Add data at beginning
    public void addFirst(Object data) {
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
            tail.next = head;
        }
        count++;
    }

    //Add at given index
    public void addAt(int index, Object data) {
        if (index < 0 || index>=size()){
            System.out.println("Invalid index");
            return;
        }
        else if (index==0){
            addFirst(data);
            return;
        }

        Node temp = head;
        Node newNode = new Node(data);
        for (int i=0; i<index-1; i++){
            temp=temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        count++;
    }

    //Remove from last
    public void remove() {
        if (head==null){
            System.out.println("list is empty");
        }
        else if (head==tail){
            head=tail=null;
            count--;
        }
        else {
            Node temp = head;
            for (int i=0; i<size()-2; i++) {
                temp=temp.next;
            }
            temp.next = tail.next;
            tail = temp;
            count--;
        }
    }

    //Remove from begin
    public void removeFirst(){
        if (head==null){
            System.out.println("list is empty!");
        }
        else if (head==tail){
            head=tail=null;
            count--;
        }
        else {
            head=head.next;
            tail.next = head;
            count--;
        }
    }

    //Remove from given index
    public void removeAt(int index){
        if (index < 0 || index>=size()){
            System.out.println("Invalid index");
        }
        else if (index==0){
            removeFirst();
        }
        else if (index==size()-1){
            remove();
        }
        else {
            Node temp = head;
            for (int i=0; i<index-1; i++) {
                temp=temp.next;
            }
            temp.next = temp.next.next;
            count--;
        }
    }

    //Remove given data
    public void remove(Object data) {
        if (head.data==data){
            removeFirst();
        }
        else if (tail.data==data){
            remove();
        }
        else {
            Node temp = head;
            for (int i=0; i<size()-1; i++){
                if (temp.next.data==data){
                    temp.next=temp.next.next;
                    return;
                }
                temp=temp.next;
            }
        }
    }
}
