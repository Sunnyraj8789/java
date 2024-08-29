
// more optimized

import java.util.Scanner;

public class prefixsum2 {

    public static void prefixSum(int arr[][])
    {
        int m=arr.length;
        int n=arr[0].length;
        // rows wise prefix sum calculate
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                arr[i][j]+=arr[i][j-1];

            }
        }

        // column wise prefix sum calculate
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    public static int SumRegion(int arr[][],int r1,int c1,int r2,int c2)
    {
        int sum=0,left=0,up=0,repeated_region=0,res=0;
        sum=arr[r2][c2];
        left=arr[r2][c1-1];
        up=arr[r1-1][c2];
        repeated_region=arr[r1-1][c1-1];

        res=sum-up-left-repeated_region;
        return res;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int m=sc.nextInt();
        System.out.println("enter the no. of column");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter the"+m +"*"+n +"element");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int r1,c1,r2,c2;
        System.out.println("enter the value of r1");
        r1=sc.nextInt();
        System.out.println("enter the value of c1");
        c1=sc.nextInt();
        System.out.println("enter the value of r2");
        r2=sc.nextInt();
        System.out.println("enter the value of c2");
        c2=sc.nextInt();

        prefixSum(arr);
        int result=SumRegion(arr,r1,c1,r2,c2);
        System.out.println("sum of"+result);

        
    }
}
