class person
{
    private String name;
    private int age;
    person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;

    }
    public void setname(int age)
    {
        if(age>0&&age<100)
        {
            this.age=age;
        }
        else
        {
            System.out.println("invalid age");
        }
    }
    public int getage()
    {
        return age;
    }
    
}
public class demo4 {
    public static void main(String[] args)
    {
    person p=new person("sunny",180);
    String name=p.getname();
    System.out.println(name);
    int age=p.getage();
    System.out.println(age);
    }
    
    
}
