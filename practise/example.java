public class example {
    public static void main(String[] args) {
        
        int arr[]={2,4,8,10,12,14};
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }

        System.out.println("after reversal array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }

    }
    
}
