public class Mergesort {

    public static void CombineMergeSort(int arr[],int l,int mid,int r){
        int i,j,k;

        //size of the left and right subarray


        int n1=mid-l+1;
        int n2=r-mid;
//create left and right subarray
        int[] lsubarray=new int[n1];
        int[] rsubarray=new int[n2];
//copy the data into the left and right subarray
        for(i=0;i<n1;i++){
            lsubarray[i]=arr[l+i];
        }

        for(j=0;j<n2;j++){
            rsubarray[j]=arr[mid+1+j];
        }
//comparison between the element in left and right subarray 
        i=0;
        j=0;
        k=l;

        while (i<n1&&j<n2) 
        {
            if(lsubarray[i]<=rsubarray[j]){
                arr[k]=lsubarray[i];
                i=i+1;
            }
            else{
                arr[k]=rsubarray[j];
                j=j+1;
            }

            k=k+1;
            
        }
//copying all the remanning element from the left subarray
        while(i<n1){
            arr[k]=lsubarray[i];
            i=i+1;
            k=k+1;
        }
///copying all the remainning element from the right subarray
        while (j<n2) {
            arr[k]=rsubarray[j];
            j=j+1;
            k=k+1;   
        }
    }


    public static void mergeSort(int[] arr,int i,int j){
        if(i<j){
            //divide the array into two subproblem
            int mid=i+(j-i)/2;
            //conquer the subproblem using recursion
            //left subarray
            mergeSort(arr,i,mid);
            //right subarray
            mergeSort(arr,mid+1,j);
            //comhine the solution of all subproblem
            CombineMergeSort(arr,i,mid,j);
        }

    } 
//function to display the element
    public static void printArr(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int arr[]={50,20,40,90,88,11,13};
        int n=arr.length;

        System.out.println("array before sorting");
        printArr(arr,n);

        mergeSort(arr,0,n-1);

        System.out.println("array after sorting ");
        printArr(arr,n);

    }
    
}
