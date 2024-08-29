import java.util.Arrays;

public class insertionSort {

   public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                //swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
                
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={20,10,15,16,12,11};
        insertionSort(arr);
        System.out.println("sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
    
}
