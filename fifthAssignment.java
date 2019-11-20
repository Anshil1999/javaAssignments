import java.util.Scanner;
public class fifthAssignment 
{
    Node head;
   public static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
    }
   public static fifthAssignment insert(fifthAssignment li,int data)
   {
       Node newnode=new Node(data);
        newnode.next=null;
        if(li.head==null)
        {
            li.head=newnode;
        }
        else
        {
            Node last=li.head;
            while(last.next != null)
            {
                last=last.next;
            }
            last.next=newnode;
        }
        return li;
   }
   public static void display(fifthAssignment li)
   {
       Node temp=li.head;
        System.out.println("Your Linked-List is as follows");
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;      
        }  
   }
   public static Node removeDuplicate(fifthAssignment li)
   {
       Node current=li.head;
		while(current!=null)
		{
			Node temp=current;
			Node temp1=current.next;
			while(temp1!=null)
			{
				if(temp1.data==current.data)
				{
					temp.next=temp1.next;
				}
				else
				{
				temp=temp.next;
				}
				temp1=temp1.next;
			}
			current=current.next;
		}
		return li.head;
   }
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number of Nodes a Linked list has:");
       int n = input.nextInt();
       fifthAssignment li = new fifthAssignment();
       System.out.println("Enter elements of the linked list:");
       for(int i=0;i<n;i++)
       {
           int data = input.nextInt();
           li.insert(li,data);
       }
       li.removeDuplicate(li);
       System.out.println("After removing the duplicate elements,The linked is:");
       li.display(li);
       System.out.println();
   }
}
/*
Write a Java program to remove duplicates from an unsorted linked list 
Input : 5 10 10 11 16 11 5 16 
Output: 5 10 11 16
*/