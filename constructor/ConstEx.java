class student{
    String name;
    int age;
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
}
class ConstEx{
    public static void main(String[] args)
    {
        student st=new student("sunny",25);
        String name=st.getname();
        System.out.println(name);
        int age=st.getage();
        System.out.println(age);
    }
}
