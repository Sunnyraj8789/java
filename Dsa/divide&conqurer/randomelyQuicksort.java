public class randomelyQuicksort {
    public static int partion(int arr[],int l,int h){

        //generate the random index within the array
        int randomindex=l+(int)Math.random()%(h-l+1);
        //swap arr[randomindex],arr[l]
        int te=arr[randomindex];
        arr[randomindex]=arr[l];
        arr[l]=te;
        int i=l;
        //pivot is the first element in an array
        int pivot=arr[l];
        for(int j=l+1;j<=h;j++){
            //to take the bigger element than the pivot
            //to take smaller element than the pivot
            if(arr[j]<=pivot){
                i=i+1;
                //swap arr[i] ,arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap pivot(arr[l]) and arr[i]
            //return the corect positon of the pivot element 
            int tem=arr[l];
            arr[l]=arr[i];
            arr[i]=tem;

            return i;

    }
    public static void quicksort(int[] arr,int l,int h){
        if(l<h){
            //1. divide the array into subproblem
            int m=partion(arr,l,h);
            //2. conquer those subproblem via recursion
            quicksort(arr,l,m-1);
            quicksort(arr, m+1, h);
        }
    }

    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        int arr[]={50,20,70,90,10,13,17,21};
        int n=arr.length;
        System.out.println("array before sort is");
        printArr(arr,n);

        quicksort(arr,0,n-1);
        System.out.println("array after sort is ");
        printArr(arr,n);
    }
}
