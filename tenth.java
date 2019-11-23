import java.util.Scanner;
public class tenth 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = input.nextInt(); 
        int arr[] = new int[n];
        int i;
        System.out.println("Enter key:");
        int key = input.nextInt();
        System.out.println("Enter elements of the array:");
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        int count = 0,max = 0;
        for(i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                max = 0;
                for(int k=i;k<=j;k++)
                {
                    if(arr[k]>max)
                    {
                        max=arr[k];
                    }                    
                }
                if(max>key)
                    count++;
            }
        }
        System.out.println("Count is --> "+count);
    }
}

/*

Given an array of n elements and an integer k. The task is to find the count of subarray which
has maximum element greater than K.

Input : arr[] = {1, 2, 3} and k = 2.
Output : 3
Explanation : All the possible subarrays of arr[] are 
{ 1 }, { 2 }, { 3 }, { 1, 2 }, { 2, 3 }, 
{ 1, 2, 3 }.
Their maximum elements are 1, 2, 3, 2, 3, 3.
There are only 3 maximum elements > 2.

*/