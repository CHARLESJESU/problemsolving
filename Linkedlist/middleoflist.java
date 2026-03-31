package Linkedlist;
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val=data;
    }
        ListNode(int data,ListNode next){
        this.val=data;
        this.next=next;
    }
}
public class middleoflist {
    public static void main(String[] args) {
        System.out.print(midllNodeanswer(new ListNode(1, 
                  new ListNode(2, 
                    new ListNode(3, 
                      new ListNode(4, 
                        new ListNode(5, 
                          new ListNode(6, null))))))).val);
    }
    static ListNode midllNodeanswer(ListNode head){
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       return slow;
    }
}
