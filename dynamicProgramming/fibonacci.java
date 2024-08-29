import java.util.HashMap;
import java.util.Map;


public class fibonacci {
    //hashmap create
    public static Map<Integer,Integer> memo=new HashMap();
    //function calling -recursive approach
    //time complexity =O(2^n)
    //space complecity = O(log n) or O(n)
    public static int fib(int n)
    {
        if(n<=1){
            return n;

        }
            return fib(n-1)+fib(n-2);
    }
    //function calling- Memoization Dynamic programming(Enhanced recursion)
    //time complexity--O(n)
    //space complexity --stack space+hashtable---O(n)
    public static int fibMemo(int n)
    {
        if(n<=1){
            return n;
        }
        //optimized logic--avoid the recomputation in the recursive function call
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        // recursive function call
        int fibVal=fibMemo(n-1)+fibMemo(n-2);
        memo.put(n,fibVal);
        return fibVal;
    }

    //function calling - Tabulation Dynamic programming (No recursion)
    //time complexity-
    //space complexity--

    public static long fibtab(int  n)
    {
        long fib[]=new long[n+1];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

    //function calling-Most optimizeed apporach
    //time complexity--O(n) linear
    //space coomplexity--O(1)--constant
    public static long fibOpt(int n){
       long first=0;
       long second=1;
        long third;
        for(int i=2;i<=n;i++){
            third=first+second;
            first=second;
            second=third;
        }
        return  second;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println("series is the "+fibOpt(n));
    }
}



/* you can change the datatype for huge amount of data stored */

