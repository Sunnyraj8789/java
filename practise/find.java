public class find {
    public static void main(String[] args)
    {
        int arr[]={2,4,3,6,5};
        int find=6;
       int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==find)
            index=i;

        }
        System.out.println("element index "+find +" is:-  "+index);
    }
    
}
