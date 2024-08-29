class animal
{
    void sleep()
    {
        System.out.println("animal needs to sleep");
    }
}
class tiger extends animal 
{   

}

class monkey extends animal
{

}

class deer extends animal
{

}

public class heirarchical {
    public static void main(String[] args) {
        tiger t=new tiger();
        t.sleep();
        
    }
    
}




