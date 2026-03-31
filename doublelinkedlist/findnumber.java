package doublelinkedlist;

public class findnumber {
    public static void main(String[] args) {
        DoubleList head = new DoubleList(10);
    head.next = new DoubleList(20);
    head.next.prev = head;
    head.next.next = new DoubleList(30);
    head.next.next.prev = head.next;

    int targetValue = 50;
    int resultIndex = findnumber(head, targetValue);
    System.out.print(resultIndex);
    }
    static int findnumber(DoubleList head,int target){
        int index=-1;
        while (head!=null) {
             index++;
            if(head.data==target){
                return index;
            }
            head=head.next;
           
        }
        return -1;
    }
}
