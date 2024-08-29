public class BinarySearch {
    public static int Binarysearch(int arr[],int low,int high,int x)
    {
        int result=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                return Binarysearch(arr,mid+1,high,x);

            }
            else{
                return  Binarysearch(arr, low, mid-1, x);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[]={2,4,10,12,14,16,20,24,28};
        int low=0;
        int high=arr.length-1;
        int x=25;
        int result=Binarysearch(arr,low,high,x);
        System.out.println("found element at index is :- "+result);
    }
    
}
