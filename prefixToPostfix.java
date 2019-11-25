import java.util.Scanner;
import java.util.Stack;
public class prefixToPostfix 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String pre = input.next();
        String result = "";
        Stack<String> s= new Stack<>();
        int len = pre.length();
        System.out.println("PostFix is-->");
        for(int i=len-1;i>=0;i--)
        {
            char ch = pre.charAt(i);
            if(Character.isLetter(ch))
            {
                s.push(ch+"");
            }
            else
            {
                String s1 = s.pop();
                String s2 = s.pop();
                result = s1 + s2 + ch;
                s.push(result);
            }
        }
        System.out.println(result);
    }
}
/*
*-A/BC-/AKL
*/