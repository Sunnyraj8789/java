public class evenIndecesPrint {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i+=2){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    
}
