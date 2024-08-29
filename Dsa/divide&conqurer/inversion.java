import java.util.*;
public class inversion {

    public static int inversionCount(int arr[], int n){
        int count=0;
        //brute force approach
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count+=1;
                }
            }
        }
        return count;
    }


    public static int mergeProcedure(int arr[],int l,int mid,int h){
        int swap=0;
        //left and right subarray
        int[] lsubarray=Arrays.copyOfRange(arr,l,mid+1);//not include last index therefore mid+1 in this function used
        int[] rsubarray=Arrays.copyOfRange(arr,mid+1,h+1);
        int i=0,j=0,k=l;

        while (i<lsubarray.length&&j<rsubarray.length) {
            if(lsubarray[i]<=rsubarray[j]){
                arr[k++]=lsubarray[i++];
                
            }
            else{
                arr[k++]=rsubarray[j++];
                //calculate no. of swaps
                swap+=(mid+1)-(l+i);
                
            }
        }

        //copy all the remaining element from left subarrray
        while(i<lsubarray.length){
            arr[k++]=lsubarray[i++];
        }
        //copy all the remaning element from the right subarray
        while(j<rsubarray.length){
            arr[k++]=rsubarray[j++];
        }
        return swap;
    }
    public static int inversionCountDC(int arr[],int l,int h){
        int count=0;
        if(l<h){
            //1. divide the array into two subproblem
            int mid=l+(h-l)/2;
            //2. conquer the subproblem using the recursive approach
            //left subarray
            count+=inversionCountDC(arr,l,mid);
            //right subarray
            count+=inversionCountDC(arr,mid+1,h);
         // combine the solution
            count+=mergeProcedure(arr,l,mid,h);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        int count=inversionCount(arr,n);
        int countOpt=inversionCountDC(arr,0,n-1);
        System.out.println("inversion count of an array using brute force approach :- "+count);
        
        System.out.println("inversion count of an array using divide and conquer approach :- "+countOpt);



    }
    
}
