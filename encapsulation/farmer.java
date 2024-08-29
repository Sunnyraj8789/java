import java.util.Scanner;

class farm
{
    int pa;
    float td;
    float ri;
    static float si;
    void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount required");
        pa=obj.nextInt();
        System.out.println("enter the time duration");
        td=obj.nextInt();
        // ri=4.5f;
    }
        void calc()
        {
            si=(pa*td*ri)/100f;
        }
        void disp()
        {
            System.out.println(si);
        }
}
public class farmer {
    public static void main(String[] args)
    {
        farm f1=new farm();
        farm f2=new farm();
        f1.input();
        f1.calc();
        f1.disp();
        f2.input();
        f2.calc();
        f2.disp();  
    }
}
