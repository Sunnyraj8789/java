import java.io.*;
import java.util.*;

public class hashmapFunction{
    public static void main(String[] args) {
       HashMap<Integer,String>hashmap=new HashMap<>();
       //functionalities of the put function
       hashmap.put(1,"sunny");
       hashmap.put(5,"karan");
       hashmap.put(3,"rahul");
       hashmap.put(4,"rakesh");

       System.out.println("hashmap of the given data is "+hashmap);

       //functionalities of the get function
       String result=hashmap.get(3);
       System.out.println("value of the given key"+result);


       //functionalities of the containsKey() function

       System.out.println(hashmap.containsKey(5));

       //functionalities of the remove
       hashmap.remove(1);
       System.out.println("updated hashmap"+hashmap);

       //iterating for the for loop
       for(Map.Entry<Integer,String>e:hashmap.entrySet())
       {
        System.out.println("hashmap is");
        System.out.println(e.getKey()+ ":"+e.getValue());

       }




    }
    
}
