import java.util.Scanner;
public class nineth 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        int i;
        int key = input.nextInt();
        for(i=0;i<n;i++)
            arr[i] = input.nextInt();
        System.out.print("Count is-->");
        int max = 0;
        for(i=0;i<=n-key;i++)
        {
            max = arr[i];
            for (int j=1;j<key;j++) 
            {
                if (max < arr[i+j])
                {
                    max = arr[i+j];
                }
            }
            System.out.print(max + " ");
	}	
        System.out.println();
    }
}
/*
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
Input : 9 3
1 2 3 1 4 5 2 3 6
Output : 3 3 4 5 5 5 6
Explanation : Starting from first subarray of size k = 3, we have 3 as maximum.
Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6.
*/