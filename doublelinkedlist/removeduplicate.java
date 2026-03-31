package doublelinkedlist;

public class removeduplicate {
    public static void main(String[] args) {
          DoubleList head = new DoubleList(10);
    head.next = new DoubleList(10);
    head.next.prev = head;
    head.next.next = new DoubleList(30);
    head.next.next.prev = head.next;

  
   DoubleList result= removeduplicateanswer(head);
  
            while(result!=null){
                System.out.print(result.data+"->");
                result=result.next;
            }
    }
    static DoubleList removeduplicateanswer(DoubleList head){
        DoubleList curr=head;
        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                DoubleList nexList=curr.next.next;
                curr.next=nexList;
                if(nexList!=null){
                    nexList.prev=curr;
                }
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
