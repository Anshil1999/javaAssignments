import java.util.Scanner;
public class secondAssignment 
{
public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
	String st=input.next();
	int n=st.length();
	char str[]=st.toCharArray();
	int count=(n-1);
	int i=0;
	while(i<count)
	{
		if(!Character.isAlphabetic(str[i]))
			i++;
		else if(!Character.isAlphabetic(str[count]))
				count--;
		else
		{
			char tmp=str[i];
			str[i]=str[count];
			str[count]=tmp;
			i++;
			count--;
		}
	}
	 st=new String(str);
	System.out.println(st);
}
}
/*
Given a string, that contains special character together with alphabets.Reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.

*/