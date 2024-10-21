import java.util.*;

public class Main {
    public static void main(String[] args) {


    }


}

class Queue{
    int size=0;
    Node top;
    Node head;

    static class Node{
        Node prev;
        int data;

        public Node(int data){
            this.data=data;
        }
    }

    public void display(){
        Node temp = top;
        while (top.prev!=null){
            System.out.print(temp.data + "->");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void push(int data){
        //top40<-30<-20<-10head
    }

}

