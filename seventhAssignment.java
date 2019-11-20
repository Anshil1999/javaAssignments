import java.util.Scanner;
public class seventhAssignment 
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
    public static seventhAssignment insert(seventhAssignment li,int data)
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
    public static void display(seventhAssignment li)
    {
        Node temp=li.head;
        System.out.println("Your Linked-List after rotaion is as follows:");
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;      
        }        
    }
    public static seventhAssignment rotation(seventhAssignment li,int r)
    {
        
        while(r>0)
        {
            Node current = li.head;
            Node pre = li.head;
            while(current.next!=null)
            {
                current = current.next;
            }
            while(pre.next!=current)
            {
                pre = pre.next;
            }
            pre.next = null;
            current.next = li.head;
            li.head = current;            
            r--;
        }
        return li;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        seventhAssignment li = new seventhAssignment();
        System.out.println("Enter size for your Linked-List:");;
        int n = input.nextInt();
        System.out.println("Enter elements of the Linked-List:");
        for(int i=0;i<n;i++)
        {
            int data=input.nextInt();
            li.insert(li,data);
        }
        System.out.println("Enter the rotation number:");
        int r = input.nextInt();
        li.rotation(li,r);
        li.display(li);
        System.out.println();
    }
}
/*
Given a singly linked list of size N. The task is to rotate the linked list counter-clockwise by k nodes,
where k is a given positive integer smaller than or equal to length of the linked list.
Input :8(size of linked list)
1 2 3 4 5 6 7 8(Elements in linked list)
4(k times rotation)
Output : 5 6 7 8 1 2 3 4
*/