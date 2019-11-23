import java.util.Scanner;
public class reversingDoublyLL 
{
     Node head;
     Node tail;
   public static class Node
    {
        int data;
        Node next;
        Node pre;
        Node(int d)
        {
            data=d;
        }
    }
   public static reversingDoublyLL insert(reversingDoublyLL li,int data)
   {
        Node newnode=new Node(data);
        newnode.next = null;
        newnode.pre = null;
        if(li.head==null)
        {
            li.head=newnode;
            li.tail = newnode;
        }
        else
        {
            Node last=li.head;
            while(last.next != null)
            {
                last=last.next;
            }
            newnode.pre = last;
            last.next=newnode;
            li.tail = newnode;
        }
        return li;
   }
   public static void reverse(reversingDoublyLL li)
   {
       if(li.head == null)
           System.out.println("Linked-List does not exist!!");
       else
       {
           Node temp = li.tail;
           while(temp!=null)
           {
               System.out.print(temp.data + "-->");
               temp = temp.pre;
           }
       }
   }
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number of Nodes a Linked list has:");
       int n = input.nextInt();
       reversingDoublyLL li = new reversingDoublyLL();
       System.out.println("Enter elements of the linked list:");
       for(int i=0;i<n;i++)
       {
           int data = input.nextInt();
           li.insert(li,data);
       }
       System.out.println("Reverse of the Linked-List is as follows:");
       reverse(li);
       System.out.println();
   }
}
/*
Write a program to reverse a doubly linked list
I/p : 7 5 2 9 8
O/p : 8 9 25 7
*/