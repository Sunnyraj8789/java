import java.util.Scanner;
import java.util.HashMap;

public class firstNonRepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();

        //create a hashtable
        for(int i=0;i<str.length();i++)              
        {                                                             
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }

//cheak non repeating element
        int result=-1;
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
        System.out.println("the first non-repeating values :- "+i);
                result=1;
                break;
            }
        }

        if(result==-1){
            System.out.println("no first repearing element");
        }

    }
    
}
