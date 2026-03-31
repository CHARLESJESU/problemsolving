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
public class reverselist {
    public static void main(String[] args) {
             ListNode temp=(reverNodeanswer(new ListNode(1, 
                  new ListNode(2, 
                    new ListNode(3, 
                      new ListNode(4, 
                        new ListNode(5, 
                          new ListNode(6, null))))))));
            ListNode result=temp;
            while(result!=null){
                System.out.print(result.val+"->");
                result=result.next;
            }
    }
    static ListNode reverNodeanswer(ListNode a){
        ListNode prev=null;
        ListNode curr=a;
        while(curr!=null){
            ListNode tempNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNode;
        }
        return prev;
    }
}
