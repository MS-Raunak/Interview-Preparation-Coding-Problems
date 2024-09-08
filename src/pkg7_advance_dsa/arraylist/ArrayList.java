package pkg7_advance_dsa.arraylist;

import java.util.NoSuchElementException;

public class ArrayList {
    Object[]arr = new Object[10]; //10 is default size of any arraylist
    int count=0;

    public int size(){
        return count;
    }

    //Increase size
    public void increaseSize() {
        Object[] newObjArr = new Object[arr.length + 5];

        //copy all elements of objArr into newObjArr
        for (int i = 0; i < arr.length; i++) {
            newObjArr[i] = arr[i];
        }
        arr = newObjArr;     // now objArr pointed to the newObjArr    }
    }

    //Add element
    public void add(Object element){
        if (count==arr.length){
            increaseSize();
        }
        arr[count] = element;
        count++;
    }

    //Add element at first position
    public void addFirst(Object val){
        if (arr==null){
            add(val);
            return;
        }
        if (count== arr.length) increaseSize();
        //shift element in rightside and make a space for val
        for (int i=count; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = val;
        count++;
    }

    //Add at given index
    public void add(int index, Object val){
        if (index < 0 || index > count){
            System.out.println("Invalid index");
            return;
        }
        if (index==0){
            addFirst(val);
            return;
        }
        else if (index==count){
            add(val);
        }
        else {
            for (int i=count; i>=index; i--){
                arr[i] = arr[i-1];
            }
            arr[index] = val;
            count++;
        }
    }

    //Remove from last
    public void remove(){
        if (count==0){
            System.out.println("Array is empty");
            return;
        }
        arr[count-1] = null;
        count--;
    }

    //Remove element from particular index
    public void remove(int index){
        if (count==0){
            System.out.println("Array is empty");
            return;
        }
        if (index < 0 || index >=count){
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
        if (index==count-1){
            remove();
            return;
        }

        for (int i=index; i< count; i++){
            arr[i] = arr[i+1];
        }
        count--;

    }

    //Remove particular element //================> INCORRECT
    public void removeVal(Object val){
        boolean flag = false;

        for (int i=0; i<count; i++){
            if (arr[i]==val){
                flag=true;
                arr[i] = arr[i+1];
            }
        }
        if (!flag){
            throw new NoSuchElementException("No such element found in arr");
        }
        System.out.println(val + " is deleted");
        count--;
    }

    //Display ArrayList
    public void display(){
       for (Object ele : arr){
           if (ele!=null)
                System.out.print(ele + " ");
           else break;
       }
        System.out.println();

    }
}
