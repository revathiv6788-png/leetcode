/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null)
        {
            return null;
        }
        Node cur=head;
        while(cur!=null)
        {
            if(cur.child!=null)
            {
                Node next=cur.next;//ithula change agatha oru oru time um
                cur.next=flatten(cur.child);//ithu appo mela itunthu varatha and return ana aprom tha next nadakkuma 
                cur.next.prev=cur;
                cur.child=null;//important
                while(cur.next!=null)
                {
                    cur=cur.next;
                }
                if(next!=null)
                {
                    cur.next=next;
                    next.prev=cur;
                }
            }
            cur=cur.next;
        }
        return head;
    }
}