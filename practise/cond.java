import java.util.Scanner;
public class cond {
    public static void main(String[] args)
    {
        int marks;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the marks");
        marks=obj.nextInt();
        if(marks>80)
        {
            System.out.println("A");
        }
        else if(marks>60) 
        {
            System.out.println("B");
        }
        else if(marks>40)
        {
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
    
}
