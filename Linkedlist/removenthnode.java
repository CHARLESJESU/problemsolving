package Linkedlist;

public class removenthnode {
    public static void main(String[] args) {
     ListNode temp=(removenthnodeanswer(new ListNode(1, 
                  new ListNode(2, 
                    new ListNode(3, 
                      new ListNode(4, 
                        new ListNode(5, 
                          new ListNode(6, null)))))),3));
            ListNode result=temp;
            while(result!=null){
                System.out.print(result.val+"->");
                result=result.next;
            }
    }
    static ListNode removenthnodeanswer(ListNode  head, int n){
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            if(fast==null){return head;}
            fast=fast.next;
        }
        if(fast==null){
            slow.next=head;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
