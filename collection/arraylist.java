package collection;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);

        ArrayList al2=new ArrayList();
        al2.add("Pw skills");
        al2.add(1);
        al2.add('j');
        al2.add(1.1);

        System.out.println(al2);

        al2.add(200);

        System.out.println(al2);

        al2.add(2,"PW");
        System.out.println(al2);




    }

    
}
