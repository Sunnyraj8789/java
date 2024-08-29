import java.util.Scanner;

public class stairProblem {
    public static int CountSum(int n)
    {
        int result=0;
        if(n<=1)
        {
            return n;
        }
        else{
            result=CountSum(n-1)+CountSum(n-2);

        }
        return result;
        
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n=sc.nextInt();
        int result=CountSum(n+1);
        System.out.println("ways  of stairs is :- "+result);

    }
}
