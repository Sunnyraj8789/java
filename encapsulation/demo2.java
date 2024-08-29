public class demo2 {
    private static int instance=0;
    public demo2()
    {
        instance++;
    }
    public static int getinstance()
    {
        return instance;
    }

    public static  void main(String[] args)
    {
        demo2 d1=new demo2();
        demo2 d2=new demo2();
        demo2 d3=new demo2();
        demo2 d4=new demo2();
        System.out.println("no.of instance:- "+demo2.getinstance());
        

        
    }
    
}
