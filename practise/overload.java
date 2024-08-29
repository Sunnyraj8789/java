import java.util.Scanner;
class  Calc{
    public int add(int a, int b,int c)
    {
       int res=a+b+c;
       return res;
    }
}
public class overload {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter three number");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        Calc obj1=new Calc();
        int res=obj1.add(2,4,5);
        System.out.println("sum of three no.:-  "+res);
    }

    
}



