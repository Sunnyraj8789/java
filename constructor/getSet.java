class student{
    private String name;
    private int id;
    private String address;

    student(String name,int id,String address)
    {
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
   
    public int getid()
    {
        return id;
    }
    
    public String getadd()
    {
        return address;
    }

}
public class getSet {
    public static void main(String[] args)
    {
    student st=new student("sunny",20,"bihar");
    System.out.println(st.getName());
    System.out.println(st.getid());
    System.out.println(st.getadd());
    




    }

    
}
