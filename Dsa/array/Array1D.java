public class Array1D {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int sum=0;

        int n=arr.length;
        for(int i=0;i<n;i+=2)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
