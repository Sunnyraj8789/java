public class reverseArr {

    public static void main(String[] args) {

        int arr[]={1,2,5,4,9,8};
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("Reversed array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
}
