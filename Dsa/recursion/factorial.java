import java.util.*;
import java.io.*;
public class factorial {

    public static int factNum(int n)
    {
        int result=0;
       //base case condition
        if(n==0||n==1)
        {
            return 1;
        }

        else
        {
            //recursive call
         result=n*factNum(n-1);
        
        }
        return result;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int result=factNum(n);
        System.out.println("factorial of given number :- " +result);
        
    }
    
}
