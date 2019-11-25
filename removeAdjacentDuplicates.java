import java.util.Scanner;
public class removeAdjacentDuplicates 
{
    public static String removeDuplicate(String str)
    {
        if(str.length() <= 1)
        {
            return str;
        }

            if(str.charAt(0) == str.charAt(1))
            {
                int count = 0;
                while(count<str.length()-1 && str.charAt(0) == str.charAt(count+1))
                {
                    count++;
                }
                return removeDuplicate(str.substring(count+1));
            }
            else
            {
                return str.charAt(0) + removeDuplicate(str.substring(1));
            }
        
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = input.next();
        int len = str.length();
        while(len>0)
        {
        str = removeDuplicate(str);
        len--;
        }
        System.out.println("After removing duplicates--> " + str);
    }
}
/*
Given a string s, recursively remove adjacent duplicate characters from the string s. 
The output string should not have any adjacent duplicates.
I/p : geeksforgeek
        acaaabbbacdddd
O/p : gksforgk
          acac
*/