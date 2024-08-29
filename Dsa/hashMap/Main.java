import java.util.Scanner;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the string");
        String str=sc.nextLine();
         
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        int result=-1;
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                System.out.println("first non repeating "+ i);
                result=1;
                break;
            }
        }

        if(result==-1){
            System.out.println("not a non element repeating ");
        }
        
    }
    
}