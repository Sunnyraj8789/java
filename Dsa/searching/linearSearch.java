import java.util.*;
import java.io.*;
public class linearSearch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of element");
        int n=sc.nextInt();

        System.out.println("enter the array element");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        //implementing the linear search
        System.out.println("enter the search element");
        int x=sc.nextInt();

        int idx=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                idx=i;
                break;
            }

        }

        if(idx==-1)
        {
            System.out.println("not found element");
        }
        else{
            System.out.println("found element at index"+idx);
        }

    }
    
}
