import java.util.Scanner;
public class chocolateQues 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        int i;
        for(i=0;i<n;i++)
            a[i] = input.nextInt();
        System.out.println("Enter number of students:");
        int m = input.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(int j= 0;j<n-i-1;j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        int diff = a[m-1] - a[0];
        System.out.println("Minimum difference is:- "+diff);
    }
}
/*
Given an array of n integers where each value represents number of chocolates in a packet. 
Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet 
with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
m = 3
Output: Minimum Difference is 2
We have seven packets of chocolates and
we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum
difference between maximum and minimum packet
sizes.
*/