//import java.util.Scanner;
import java.util.*;
public class phoneBook 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the phone book");
        int n = input.nextInt();
        int i;
        Map<String,String> pb = new HashMap<>();
        System.out.println("Enter elements of the phone-book");
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name:");
            String name = input.next();
            System.out.println("Enter phone number:");
            String number = input.next();
            pb.put(name,number);
        }
        System.out.println("Enter number of input values:");
        int m = input.nextInt();
        String result[] = new String[m];
        for(i=0;i<m;i++)
        {
            System.out.println("Enter name you want to search:");
            String ques = input.next();
            if(pb.get(ques)!=null)
                result[i]=ques + "-->" + pb.get(ques);
            else
                result[i] = "Not found!";
        }
        for(i=0;i<m;i++)
            System.out.println(result[i]);
    }
}
/*
You are given a phone book that consists of people's names and their phone number. 
After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book.
Each entry consists of two lines: a name and the corresponding phone number.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933
*/