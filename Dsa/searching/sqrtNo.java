import java.util.*;
import java.io.*;
public class sqrtNo {
    public static int SqrtNoFind(int num)
    {
        int low=0,high=num,result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==num)
            {
                return mid;
            }
            else if(val<num)
            {
                low=mid+1;
                result=mid;

            }
            else{
                high=mid-1;
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which want to take sqrt");
        int num=sc.nextInt();
        int result=SqrtNoFind(num);
        System.out.println("squre root of element is :- "+result);
    }
}
