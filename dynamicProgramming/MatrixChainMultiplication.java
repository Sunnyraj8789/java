import java.util.Arrays;

public class MatrixChainMultiplication {

    public static int minMatrixMulMemo(int arr[],int i,int j){
        //function defination of memoization

        int n=arr.length;
        int[][] dp=new int[n][n];
        //initialization of 2d array
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return minMatrixMulMemohelper(arr,i,j,dp);
    }

    public static int minMatrixMulMemohelper(int[] arr,int i,int j,int dp[][]){
        if(i==j){
            return 0;
        }

        //optimized logic avoid the recomputation
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        //recursive function call
        int minOpr=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int operations=minMatrixMul(arr, i, k) +minMatrixMul(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            minOpr=Math.min(operations,minOpr);
        }
        dp[i][j]=minOpr;
        return minOpr;
    }


    //recursive approach
    //time complexity--> O(2^n^2) exponential time comlexity
    //space complexity


    public static int minMatrixMul(int arr[],int i,int j){
        //base case condtion
        if(i==j){
            return 0;
        }
        //recursive function call
        int minOpr=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int operations=minMatrixMul(arr, i, k) +minMatrixMul(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            minOpr=Math.min(operations,minOpr);

        }
        return minOpr;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int i=1;
        int j=n-1;

        //function calling
        System.out.println("Minimum operation required for above Matrix Multiplication :- "+minMatrixMulMemo(arr,i,j));

    }
    
}
