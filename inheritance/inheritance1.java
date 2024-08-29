class human{
    private String name;
    int age;
        human()
        {
            System.out.println("human class constructor");
        }

    void sleep()
    {
        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);

    }
}

class student extends human
{
    void disp()
    {
        System.out.println("the age is : "+age);
        // System.out.println("the name is"+name);

    }

}
public class inheritance1 {
    public static void main(String[] args) {
        student st=new student();
        st.sleep();
        st.disp();
    }

    
}
