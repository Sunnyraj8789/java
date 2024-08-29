public class evenNumber {
    public static void main(String[] args) {
        int arr[]={4,3,6,7,1};
        int n=arr.length;

        for(int ele:arr){
            if (ele%2==0) {
                System.out.println(ele);   
            }
        }

    }
    
}
