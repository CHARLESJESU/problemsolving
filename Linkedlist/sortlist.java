package Linkedlist;

import java.util.List;

public class sortlist {
    public static void main(String[] args) {
                   ListNode temp=(sorListNodeanswer(new ListNode(4, 
                  new ListNode(2, 
                    new ListNode(1, 
                      new ListNode(3, 
                         null))))));
            ListNode result=temp;
            while(result!=null){
                System.out.print(result.val+"->");
                result=result.next;
            }
    }
    static ListNode sorListNodeanswer(ListNode head){
        if (head == null || head.next == null) {
        return head;
    }
        ListNode mid=findbeforemiddle(head);
        ListNode right=mid.next;
        ListNode left=head;
        
        mid.next=null;
        left = sorListNodeanswer(left);
        right = sorListNodeanswer(right);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next=left;
                left=left.next;
            }
            else if(left.val>=right.val){
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;
        }
        curr.next=(left!=null)?left:right;
        return dummy.next;
    }
    static ListNode findbeforemiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
    
        return slow;
    }
}
