// Design a class for Complex numbers in Java .In addition to methods for basic operations on complex 
// numbers, provide a method to return the number of active objects created. 

import java.util.Scanner;
class add
{
    public int add(int a,int b)
    {
        int total=a+b;
        return total;
    }
}
public class object2 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the two number");
       int a=obj.nextInt();
       int b=obj.nextInt();
        
        add obj2=new add();
        int total=obj2.add(a,b);
        System.out.println(total);
    }
}
