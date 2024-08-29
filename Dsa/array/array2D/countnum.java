import java.util.*;

public class countnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int m=sc.nextInt();
        System.out.println("enter the number of columns");
        int n=sc.nextInt();

        //2D array initilizaton
        int arr[][]=new int[m][n];

        System.out.println("enter the array elements:- ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }



        //logic of  the finding the total number of postive ,negetive , even ,odd,and zeros
        int positive=0,negetive=0,odd=0,even=0,zeros=0;

        for(int i=0;i<m;i++){
            for(int j=0;i<n;i++){
                if(arr[i][j]>0){
                    //positive number
                    System.out.println("positive number");

                }
                //negetive number

                if(arr[i][j]<0){
                    System.out.println("negetive number");
                }

            }
        }


    }
    
}
