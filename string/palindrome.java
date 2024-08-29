import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        String org ,rev="";
        Scanner in= new Scanner(System.in);
        System.out.println("enter string ");
        org=in.nextLine();
        int len=org.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+org.charAt(i);
        }

        if (org.equals(rev)) 
        {
            System.out.println("palindrome");
            
        }
        else{
            System.out.println("not a palindrome");
        }

        
    }
    
}
