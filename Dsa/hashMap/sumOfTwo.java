import java.util.HashMap;
import java.util.Scanner;

public class sumOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();


        //create a hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }

        //if current is the equal to the target
        int result[]=new int[2];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target&&map.containsKey(0))
            {
                result[0]=i;
                result[1]=map.get(0);
                break;
            }

            //not equal to the target
           
            else if(map.containsKey(target-arr[i])){
                //element is not repeatable
                if(map.get(target-arr[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        
        System.out.println("Two Sum index values is : ["+result[0]+","+result[1]+"]");

    }
    
}
