class aeroplane
{
    public void takeoff()
    {
        System.out.println("takeoff");
    }
    public void fly()
    {
        System.out.println("fly");
    }
}
class cargoplane extends aeroplane
{
    public void fly()
    {
        System.out.println("carry goods");
    }

    public void carrygoodd()
    {
        System.out.println("goods");
    }
    
}

class passengerplane extends aeroplane
{
        public void fly()
    {
        System.out.println("carry passenger");
    }
}

public class method {
    public static void main(String[] args) {
         cargoplane cp=new cargoplane();
         cp.takeoff();
         cp.fly();
         cp.carrygoodd();
         passengerplane pp=new passengerplane();
         pp.takeoff();
         pp.fly();
        
    }
   
    
}
