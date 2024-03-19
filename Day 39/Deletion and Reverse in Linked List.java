class GFG
{
    //This method returns the head of the LL after deleting node with value d.
     public static Node deleteNode(Node head,int d)
    {
        if(head==null) return head;
        Node temp=head;
        while(temp.next!=head){
            if(temp!=null){
                if(temp.next.data==d){
                    temp.next=temp.next.next;
                    return head;
                }
            }
            temp=temp.next;
        }
        Node tail=temp;
        
        if(d==head.data){
            tail.next=head.next;
            return head.next;
        }
        
        return null;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr.next!=head){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        curr.next=prev;
        prev=curr;
        curr=next;
        head.next=prev;
        return prev;
    }
    }