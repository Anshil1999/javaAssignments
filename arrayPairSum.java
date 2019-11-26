import java.util.Scanner;
public class arrayPairSum 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of 1st array:");
        int n = input.nextInt();
        System.out.println("Enter size of 2nd array:");
        int m = input.nextInt();
        
        System.out.println("Enter the sum key:");
        int key = input.nextInt();
        int i;
        int a1[] = new int[n];
        int a2[] = new int[m];
        System.out.println("Enter elements of 1st array:");
        for(i=0;i<n;i++)
            a1[i] = input.nextInt();
        System.out.println("Enter elements of 2nd array:");
        for(i=0;i<m;i++)
            a2[i] = input.nextInt();
        
        System.out.println("Value pairs are:");
        for(i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((a1[i]+a2[j]) == key)
                {
                    System.out.println("*   "+a1[i] + " " + a2[j]);
                }
            }
            
        }
    }
}
/*
Given two unsorted arrays A of size N and B of size M of distinct elements, the task 
is to find all pairs from both arrays whose sum is equal to X.
I/p : 5 5 9
1 2 4 5 7
5 6 3 4 8

I/p : 2 2 3
0 2
1 3

O/p : 1 8, 4 5, 5 4
O/p :  0 3, 2 1
*/