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
public class palindromeornot {
    public static void main(String[] args) {
          System.out.print(palindromeornotanswer(new ListNode(1, 
                  new ListNode(2, 
                    new ListNode(1, 
                      new ListNode(1, 
                        null))))));
    }
    static boolean palindromeornotanswer(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode reverse=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=reverse;
            reverse=curr;
            curr=temp;
        }
        ListNode firsthalf=head;
       
       while(reverse!=null){
        if(firsthalf.val!=reverse.val){return false;}
        firsthalf=firsthalf.next;
        reverse=reverse.next;
       }
        return true;
    }
}
