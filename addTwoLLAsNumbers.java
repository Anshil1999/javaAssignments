import java.util.Scanner;
import java.lang.Math;
public class addTwoLLAsNumbers 
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
    public static addTwoLLAsNumbers insert(addTwoLLAsNumbers li,int data)
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
        public static void display(addTwoLLAsNumbers li)
    {
        Node temp=li.head;
        System.out.print("Your Linked-List is as follows:");
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;      
        }        
    }
    public static double addLLnumbers(addTwoLLAsNumbers li)
    {
        Node temp=li.head;
        double sum= temp.data;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        addTwoLLAsNumbers l1 = new addTwoLLAsNumbers();
        addTwoLLAsNumbers l2 = new addTwoLLAsNumbers();
        addTwoLLAsNumbers l3 = new addTwoLLAsNumbers();
        System.out.println("Enter size of 1st LL:-");
        int n1 = input.nextInt();
        System.out.println("Enter size of 1st LL:-");
        int n2 = input.nextInt();
        int i;
        System.out.println("Enter Elements of first LL");
        for(i=0;i<n1;i++)
        {
            int data = input.nextInt();
            l1.insert(l1,data);
        }
        System.out.println("Enter Elements of Second LL");
        for(i=0;i<n2;i++)
        {
            int data = input.nextInt();
            l2.insert(l2,data);
        }
        double sum1=0;
        double sum2=0;
        for(i=n1-1;i>=0;i--)
        {
        sum1 += addLLnumbers(l1)*Math.pow(10, i);
        l1.head = l1.head.next;   
        }
        int sum3 = (int)sum1;
        
        int rev1 = 0;
        int rev2 = 0;
        while(sum3 != 0)
        {
            int temp = sum3%10;
            rev1 =rev1*10+temp;
            sum3 = sum3/10;
        }
        for(i=n2-1;i>=0;i--)
        {
        sum2 += addLLnumbers(l2)*Math.pow(10, i);
        l2.head = l2.head.next;   
        }
        int sum4 = (int)sum2;
        while(sum4 != 0)
        {
            int temp = sum4%10;
            rev2 =rev2*10+temp;
            sum4 = sum4/10;
        }
        int answer = rev1+rev2;
        
        System.out.println("Addition is: "+answer);
        while(answer!=0)
        {
            int temp = answer % 10;
            l3.insert(l3,temp);
            answer = answer/10;
        }
        l3.display(l3);
        System.out.println();
    }
}
/*
Given two numbers represented by two lists, write a function that returns the sum list.
The sum list is list representation of the addition of two input numbers.
Input: List1: 5->6->3  // represents no. 365
List2: 8->4->2 //  represents no. 248
Output: Resultant list: 3->1->6  // represents number 613
*/