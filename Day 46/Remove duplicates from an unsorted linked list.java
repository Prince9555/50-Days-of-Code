import java.util.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Remove_Duplicate_From_LL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

      void printList(PrintWriter out)
    {
        Node temp = head;
        while (temp != null)
        {
           out.print(temp.data+" ");
           temp = temp.next;
        }  
        out.println();
    }
	
	/* Drier program to test above functions */
	public static void main(String args[])throws IOException
    {
       
        
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out=new PrintWriter(System.out);
		 int t=Integer.parseInt(in.readLine().trim());
		  
		 while(t>0)
         {
			int n = Integer.parseInt(in.readLine().trim());
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			String s[]=in.readLine().trim().split(" ");
			int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = Integer.parseInt(s[i]); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList(out);
		
        t--;		
        }
        out.close();
    }
}

// } Driver Code Ends


/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
     public Node removeDuplicates(Node head) 
    {
        if(head == null || head.next ==null) return head;
         HashSet<Integer> set = new HashSet<>();
         Node curr = head;
         Node prev= head;
         
         while(curr!= null){
            if(set.contains(curr.data)){
                // delete
                prev.next = curr.next;
                curr = prev.next;
            }else{
                prev = curr;
                set.add(curr.data);
                curr  = curr.next;
            }
         }
         
         return head;
    }}