public class Reverse1 {
    public static void main(String[] args)
    {
        String str="PWSKILLS";
        String res=reverse(str);
        System.out.println("original string "+str);
        System.out.println("reversee string "+res);

    }
    
    public static String reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
