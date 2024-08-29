public class missingNo {
    public static void main(String[] args) {
        int arr[]={1,2,4,7,6,5};
        int n=arr.length;
        int sum_naturalNo=(n+1)*(n+2)/2;

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        int missingNo=0;
        missingNo=sum_naturalNo-sum;
        System.out.println(missingNo);
    }
    
}
