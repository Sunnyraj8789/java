class A
{
    public void show()
    {
        System.out.println("in show");
    }
    class B
    {
        public void disp()
        {
            System.out.println("in display");
        }

        class C
        {
            public void calc()
            {
                System.out.println("sum of two number");
            }
        }
    }
}
public class example1{
    public static void main(String[] args) 
    {
        A obj=new A();
        A.B obj1=obj.new B();
        A.B.C obj2=obj1.new C();
        obj.show();
        obj1.disp();
        obj2.calc();

    }
}
