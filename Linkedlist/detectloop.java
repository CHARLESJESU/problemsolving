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
public class detectloop {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
ListNode n2 = new ListNode(2);
ListNode n3 = new ListNode(3);
ListNode n4 = new ListNode(4);
ListNode n5 = new ListNode(5);

n1.next = n2;
n2.next = n3;
n3.next = n4;
n4.next = n5;

// 🔥 Create loop
n5.next = n2;

                System.out.print(detectloopanswer(n1));
    }
    static boolean detectloopanswer(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            return true;
        }
        }
        
        return false;
    }
}
