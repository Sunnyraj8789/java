import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class staircase{
    //normal recursion-->
    public static int countsum(int n){
        if(n==1||n==2)
        {
            return n;
        }
        else{
            return countsum(n-1)+countsum(n-2);
        }
    }
    //by using dynamic programming --memoization approach
    //time complexity---o(n)
//space complexity---o(n)
//Memoization Approach (Dynamic Programming) -Recursion

    public static Map<Integer,Integer> Memo = new HashMap<>();
    public static int climbStairsMemo(int n) {
        if(n==1||n==2){
            return n;
        }
        //avoid the recomputation
        if(Memo.containsKey(n)){
            return Memo.get(n); 
        }
        //recurive function call
        int numWays=climbStairsMemo(n-1)+climbStairsMemo(n-2);
        Memo.put(n,numWays);
        return numWays;
    }
    //Dyanmic recursion --Tabulation
    //time complexity ---O(n);
    //space comlexity----O(n)
    public static int climbStairsTab(int n){
        if(n==1){
            return 1;
        }

        //array initializaztion
        int[] cs=new int[n+1];
        cs[1]=1;
        cs[2]=2;
        for(int i=3;i<=n;i++){
            cs[i]=cs[i-1]+cs[i-2];
        }
        return cs[n];
    }

//more optimised
//time --O(n)
//space ---O(1)--constant space
    public static int climbStairsOpt(int n)
    {
        if(n==1){
            return 1;
        }
        int first=1,second=2,third;
        for(int i=3;i<=n;i++){
        third=first+second;
        first=second;
        second=third;
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n=sc.nextInt();
        System.out.println("number of ways is  "+ climbStairsOpt(n));
    }
}
