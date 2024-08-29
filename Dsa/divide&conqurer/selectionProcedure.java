public class selectionProcedure {

    public static int partion(int arr[],int l,int h){
        int i=l;
        int pivot=arr[l];
        for(int j=l+1;j<=h;j++){
            //j - to take the bigger value

            if(arr[j]<=pivot){
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int tem=arr[l];
        arr[l]=arr[i];
        arr[i]=tem;
        return i;  
    }
    //function to implement the kth smallest element finding in an array
    public static int selectionProcedure(int arr[],int l,int h,int k){
        //1. divide the array using the partion algorithm
            int m=partion(arr,l,h);
            //relationship b/w index number and position number
            if(m==k-1){
                return arr[m];
            }

            //traversing towards right side of an array

            else if(m<k-1){
                //conquer using the recursion
                return selectionProcedure(arr,m+1,h,k);

            }
            else{
                //treversing towards left side of an array
                return selectionProcedure(arr,l,m-1,k);  
            }
        
    }
    public static void main(String[] args) {
    int arr[]={50,30,70,90,10,34,89,98,13};

    int n=arr.length;
    int k=3;
    int result=selectionProcedure(arr,0,n-1,k);
    System.out.println(result);



    }
    
}
