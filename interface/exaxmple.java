interface a
{
    int num=7;
    default void config()
    {
        System.out.println("interface without class");
    }

    static void abc()
    {
        System.out.println("in abc");
    }
}


class b implements a{
    public void show()
    {
        System.out.println("in show");

    }
}
public class exaxmple {
    public static void main(String[] args)
    {
         a.abc();
    }
}