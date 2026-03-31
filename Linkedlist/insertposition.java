package Linkedlist;

import java.util.List;

public class insertposition {
    public static void main(String[] args) {
          ListNode temp=(inserListNodeanswer(new ListNode(1, 
                  new ListNode(2, 
                    new ListNode(3, 
                      new ListNode(4, 
                        new ListNode(5, 
                          new ListNode(6, null)))))),new ListNode(5), 3));
            ListNode result=temp;
            while(result!=null){
                System.out.print(result.val+"->");
                result=result.next;
            }
    }
    static ListNode inserListNodeanswer(ListNode head, ListNode a, int position){
        ListNode temp=head;
        int count=0;
        while(temp!=null && count<position){
            temp=temp.next;
            count++;
        }
        if(count==position){
            a.next=temp.next;
            temp.next=a;
           
        }
 return head;

    }
}
