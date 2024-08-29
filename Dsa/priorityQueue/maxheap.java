public class maxheap {
    public static void heapify(int arr[],int n,int i){
        //assumption parent node contains the largest data
        int largest=i;
        int leftIDX=2*i+1;
        int rightIDX=2*i+2;
        if(leftIDX<n&&arr[leftIDX]>arr[largest]){
            largest=leftIDX;
        }
        if(rightIDX<n && arr[rightIDX]>arr[largest]){
            largest=rightIDX;
        }

        if(largest!=i){
            //swap the arr[largest] and arr[i]
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
    public static void displayheap(int arr[],int n){
        System.out.println("array representation of maxheap");
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,4,6,13,10,9,8,15,17};
        int n=arr.length;
         //function calling
         buildheap(arr,n);
         displayheap(arr,n);
    }
    
}
