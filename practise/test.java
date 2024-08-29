// automatic promotion

class test {
    public void m1(int i)
    {
        System.out.println("integer args");
    }
    public void m1(double d)
    {
        System.out.println("double args");
    }

    public static void main(String[] args)
    {
        test t=new test();
        t.m1('a');
        t.m1(10.5);
    }
    
}
