public class demo3 {
    public static void main(String[] args) {
        int num1=6;
        int num2=0;
        int result=0;
        try
    {
        result=num1/num2;
    }
    catch(Exception e)
    {
        System.out.println("something went wrong");
    }
        System.out.println(result);
        System.out.println("bye");
    }
}