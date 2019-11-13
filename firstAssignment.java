import java.util.Scanner;
public class firstAssignment 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = input.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
            a[i] = input.nextInt();
        System.out.println("Enter the key :");
        int key = input.nextInt();
        int sum = 0,c=0;
        for(i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum += a[k];
                }
                if(sum==key)
                {
                    System.out.println("Starting Index is: "+i+",Endind index is: "+j);
                    c=1;
                }
                else
                    sum = 0;
            }
        }
        if(c!=1)
        {
            System.out.println("No such sub array exists!!");
        }
    }
}


/*
Ques:
Given an Array of non negative Integers and a number. You need to print all the starting and ending indices of 
Subarrays having their sum equal to the given integer.

For Example :-

Input-int[] arr = {2, 3, 6, 4, 5};
int num = 20
Output-
starting index : 0, Ending index : 4
*/
