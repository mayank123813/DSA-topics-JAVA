// method 1 using stack but with complexity(space) O(n)
//method 2
class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null;
        Node temp = head;
        Node front=head;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}
// method 3 recursive solution
class Solution {
    Node reverseList(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node nex = reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        
        return nex;
    }
}









