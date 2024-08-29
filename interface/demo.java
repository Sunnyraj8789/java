interface computer
{
    void compileCode();
}




class laptop implements computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors!");

    }
}

class desktop implements computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors!  faster");

    }
}
class developer
{
    public void buildapp(desktop obj)
    {
        System.out.println("building app");
        
        obj.compileCode();
    }
}
public class demo {
    public static void main(String[] args) {
        desktop obj=new desktop();
        developer dev=new developer();
        dev.buildapp(obj);
    }
    
}
