import java.util.Scanner;
public class llPallindromOrNot 
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
    public static llPallindromOrNot insert(llPallindromOrNot li,int data)
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
        public static void display(llPallindromOrNot li)
    {
        Node temp=li.head;
        System.out.print("Your Linked-List is as follows:");
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;      
        }        
    }
        public static double fetchLL(llPallindromOrNot li)
    {
        Node temp=li.head;
        double sum= temp.data;
        return sum;
    }
        public static void main(String args[])
        {
            Scanner input = new Scanner(System.in);
            llPallindromOrNot li = new llPallindromOrNot();
            System.out.println("Enter size of the LL:");
            int n = input.nextInt();
            System.out.println("Enter the elements of the LL:");
            for(int i=0;i<n;i++)
            {
                int data = input.nextInt();
                li.insert(li,data);
            }
            int sum = 0;
            for(int i=n-1;i>=0;i--)
            {
                sum += fetchLL(li)*Math.pow(10, i);
                li.head = li.head.next;   
            }
            int temp = sum;
            int rev = 0;
            while(sum != 0)
            {
                int temp1 = sum%10;
                rev =rev*10+temp1;
                sum = sum/10;
            }
            if(temp == rev)
                System.out.println("Linked-List is Pallindrom!");
            else
                System.out.println("Linked-List is NOT pallindrom!!");
        }
}
/*
Write a java program to check if a singly linked list is a plaindrom or not.
*/