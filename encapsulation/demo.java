public class demo {
    public static void main(String[] args)
    {
        // student obj=new student();
        // student obj1=new student();
        // obj.age=18;
        // obj.name="sunny";
        // obj.setAge(20);
        // obj1.setAge(18);
        // obj.setName("Sunny");
        // obj1.setName("Shreya");
        // obj.show();
        // obj1.show();
        // int stud1=obj.getAge();
        // System.out.println(stud1);
        student st=new student("sunny",25);
        String name=st.getName();
        System.out.println(name);
        int age=st.getAge();
        System.out.println(age);

    }
}

class student
{
    private int age;
    private String name;
        
    public int getAge() {
        return age;
    }

    student(String name ,int age)
    {
        this.name=name;
        this.age=age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    public void show()
    {
        System.out.println(name +"  "+ age);
    }
}
