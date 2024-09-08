package pkg7_advance_dsa.linkedlist_doubly;

public class Node {
    Node prev;
    Object data;
    Node next;
    //[[prev][data][next]]
    //[[null][10][101]]<==>[[100][20][103]]<==>[[102][30][102]]<==>NULL


    public Node(Object data) {
        this.data = data;
    }
}
