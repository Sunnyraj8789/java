import java.util.Scanner;

public class fibonacci {

    public static int fibonacciNo(int n)
    {
        int result=0;
        if(n<=1)
        {
            return n;
        }
        else{
            result= fibonacciNo(n-1)+fibonacciNo(n-2);
        }
        return result;


    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the number which want to fibonacci nu. :- ");
         int n=sc.nextInt();
         int result=fibonacciNo(n);
         System.out.println("fibonacii number is :-"+result);
    }
    
}
