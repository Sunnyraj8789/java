class student
{
    private int age;
    private String name;
    public student()
    {
        System.out.println("default constructor");
        age=18;
        name="sunny";
    }
    public student(int age)
    {
       this.age=age;
       name="sunny";

    }
    public student(String name)
    {
        this.name=name;
        age=19;
    }

    public student(String name,int age)
    {
        age=18;
        name="sunny";
    }

    public void show()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class overload {
    public static void main(String[] args)
    {
        student st=new student();
        st.show();
        
        student st1=new student(20);
        st1.show();
        
        student st2=new student("raj");
        st2.show();
        
        student st3=new student("shreya",25);
        st3.show();
    }
}
