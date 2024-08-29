import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class typesofmap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(3,"Sunny");
        map.put(1,"Raj");
        map.put(7,"gupta");
        map.put(5,"Jeet");

        System.out.println("Hashmap class look like"+map);


        //order of insertion retined in linkedhashmap
        LinkedHashMap<Integer,String>map1=new LinkedHashMap<>();
        map1.put(3,"Sunny");
        map1.put(1,"Raj");
        map1.put(7,"gupta");
        map1.put(5,"Jeet");

        System.out.println("linked hashmap class look like"+map1);


        //sorted output on the basic off the keys


        TreeMap<Integer,String>map2=new TreeMap<>();
        map2.put(3,"Sunny");
        map2.put(1,"Raj");
        map2.put(7,"gupta");
        map2.put(5,"Jeet");

        System.out.println("tree map look like"+map2);

    }
    
}
