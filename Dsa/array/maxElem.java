

public class maxElem {
    public static void main(String[] args) {
        int arr[]={34,21,54,65,43};
        int max=Integer.MIN_VALUE;
        for(int val:arr)
        {
            max=Math.max(max,val);
        }
        System.out.println("largest element"+max);
    }
    
}
