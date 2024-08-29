import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }

            if(min_idx!=i)
            {
                //swap
                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,15,2,5,12};
        selectionSort(arr);
        System.out.println("Sorted array is:- ");
        System.out.println(Arrays.toString(arr));
    }
    
}
