import java.util.Scanner;

public class powerElement {

    public static long PowerOfElement(int a,int b)
    {
        long result=0;
        long finalresult=0;
        int mid=0;
        if(b==1)
        {
            return a;
        }
        else{
            mid=b/2;
           result=PowerOfElement(a,mid);
           finalresult=result*result;
        if(b%2==0)
        {
            return finalresult;
        }
        else{
            return a*finalresult;
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int a=sc.nextInt();
        System.out.println("enter the power");
        int b=sc.nextInt();

    
        long result=PowerOfElement(a,b);
        System.out.println("power of element is :- "+result);
    
    }
    
}
