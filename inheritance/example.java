class human
{
    String name;
    int age;

    human()
    {
        System.out.println("human class constructor");
    }

    void sleep()
    {
        age=18;
        System.out.println("human needs to goes sleep");
        System.err.println(age);
    }

}

class student extends human
{
    void disp()
    {
     name="sunny";
    System.out.println("the age is: "+age);
    System.out.println("the name is: "+name);
    }

}
public class example {
    
    public static void main(String[] args)
    {
        student st=new student();
        st.sleep();
        st.disp();

    }
}
