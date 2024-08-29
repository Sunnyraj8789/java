public class Reverse {
    public static void main(String[] args)
    {
        String name = "Sunny raj";
        String reverse ="";

     for(int i=name.length()-1;i>=0;i--)
     {
        char names =name.charAt(i);
        reverse=reverse + names;

     }
     System.out.println(reverse);
        
    }
    
}
