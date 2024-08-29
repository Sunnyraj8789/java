import java.util.Scanner;
import java.util.Stack;
public class validParenthesis {
    public static boolean isvalid(String str)
    {
        char[] chars=str.toCharArray();
        Stack<Character>stack1=new Stack<>();
        for(char ele:chars)
        {
            //open bracket push into the stack
            if(ele=='['||ele=='('||ele=='{')
            {
                stack1.push(ele);
                continue;
            }
            //if stack is empty then return false
            else if(stack1.empty())
            {
                return false;
            }
            // if open bracket is not equal to ele then return false
            // and each open bracket for pop the element into the stack
            char top=stack1.pop();
            if(top=='{'&&ele!='}'){
                return false;
            }
            if(top=='('&&ele!=')'){
                return false;
            }
            if(top=='['&&ele!=']'){
                return false;
            }
        }
        return(stack1.empty()==true);
    }
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("is string is valid ? "+isvalid(str));
    }
}