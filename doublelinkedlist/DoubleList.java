package doublelinkedlist;

public class DoubleList {
    int data;
    DoubleList next;
    DoubleList prev;
    DoubleList(int data){
        this.data=data;
    }
        DoubleList(int data,DoubleList next, DoubleList prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
