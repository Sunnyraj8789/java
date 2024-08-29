class student1{
        private String name;
        private int age;
        public student1()
        {
            System.out.println("defualt constructor");
            name="sunny";
            age=15;
        }
        public student1(String name)
        {
            this.name=name;
        }
       public student1(int age)
       {
            this.age=age;
       }
       public student1(String name,int age)
       {
            this.age=age;
            this.name=name;
       }
       public void display()
       {
            System.out.println(name);
            System.out.println(age);
       }
}
public class overload1{
    public static void main(String[] args)
    {
        student1 st=new student1();
        st.display();

        student1 st1=new student1(15);
        st1.display();
        
        student1 st2=new student1("sunnny",20);
        st2.display();

        student1 st3=new student1("Rahul");
        st3.display();


    }
}