import java.util.Scanner;

public class userinput {
    public static void main(String[] args)
    {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("sum is :"+(a+b));
    }   
    
}
