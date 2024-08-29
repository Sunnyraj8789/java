//single level inheritance

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
public class single {
    public static void main(String[] args) {
        tiger t=new tiger();
        t.sleep();
        
    }
    
}
