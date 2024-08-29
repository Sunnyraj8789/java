public class heapSort {

    public static void heapify(int arr[],int n,int i){
        int largest=i;
        int leftIDX=2*i+1;
        int rightIDX=2*i+2;
        if(leftIDX<n&&arr[leftIDX]>arr[largest]){
            largest=leftIDX;
        }
        if(rightIDX<n&&arr[rightIDX]>arr[largest]){
            largest=rightIDX;
        }

        if(largest!=i){
            //swap arr[largest] and arr[i]
             int temp=arr[largest];
             arr[largest]=arr[i];
             arr[i]=temp;

             heapify(arr, n, largest);
        }
        
    }

    public static void buildheap(int arr[],int n){
        int startIDX=n/2-1;
        for(int i=startIDX;i>=0;i--){
            heapify(arr,n,i);

        }
    }

    public static void heapsort(int arr[],int n){
        //1. construct the max heap
        buildheap(arr,n);
        //2.  heapsort
        for(int i=n-1;i>=0;i--){
            //a. swap arr[i] and arr[0];
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            //b. function calling of heapify 
           heapify(arr,i,0);
        }
    }

    //function defination of display heap
    public static void displayheap(int arr[],int n){
        System.out.println("sorted array after using heapsort");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }



    public static void main(String[] args)
    {
        int arr[] ={1,3,5,4,6,13,10,9,8,15,17};
        int n=arr.length;

        //function calling
        heapsort(arr,n);
        displayheap(arr,n);

    }
    
}
