class demo{
    static int a;
    static int b;

    int m;
    int n;

    static{
        System.out.println("control in static block");
        a=10;
        b=20;

    }

    {
        System.out.println("control in non static");
        m=5;
        n=4;
    }

    static void disp1()
    {
        System.out.println("value of static variable a:"+a);
         System.out.println("value of static variable b:"+b);
    }

     void disp2()
     {
         System.out.println("value of non-static variable m:"+m);
         System.out.println("value of non-static variable n:"+n);
    }

    
}


public class static1 {
    public static void main(String[] args)
    {
        demo d=new demo();
        demo.disp1();
        d.disp2();
    }
    
}
