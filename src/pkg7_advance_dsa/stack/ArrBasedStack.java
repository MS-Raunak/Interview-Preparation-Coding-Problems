package pkg7_advance_dsa.stack;

import java.util.Arrays;

//Stack implementation using array
public class ArrBasedStack {
    int[]stackArr;
    int maxSize;
    int top;

    public ArrBasedStack(int maxSize){
        this.maxSize = maxSize;
        this.stackArr = new int[maxSize];
        this.top = 0;
    }

    //push element in stack
    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is full..Cant' push " + ele );
            return;
        }
        stackArr[top] = ele;
        top++;
    }

    //pop element
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty..can't pop element");
            return -1;
        }
        int poppedEle = stackArr[top-1];
        stackArr[top-1] = 0;
        top--;

        return poppedEle;
    }

    //Method to peek the top element of the stack without removing it
    public int peek(){
        return stackArr[top-1];
    }

    //check stack is empty or not
    private boolean isEmpty() {
        return top==0;
    }

    //check stack is full or not
    private boolean isFull() {
        return top>maxSize-1;
    }

    //Driver
    public static void main(String[] args) {
        ArrBasedStack stack = new ArrBasedStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        //stack.push(40);

        System.out.println(Arrays.toString(stack.stackArr));

        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());

        //System.out.println(stack.peek());
    }


}
