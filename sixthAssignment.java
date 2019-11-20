import java.util.Scanner;
public class sixthAssignment 
{
    public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int arr[]=new int [n];
        int i;
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
            arr[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
        {
            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j]&&arr[i]!='\0')
                {
                    count++;
                    arr[j]='\0';
                }
            }
            if(arr[i]!='\0')
            System.out.println("Count of "+arr[i]+" --> "+count);
        }
    }
}
/*
Given an array which may contain duplicates, print all elements and their frequencies.
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1
*/