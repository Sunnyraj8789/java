public class demo {
    public static void main(String[] args)
    {

        add(new int[]{10,20,30,40});
        add(new int[]{20,40});
        add(new int[]{});
            // int a[]={2,5,5,4,8};
            // System.out.println(a.length);

        // Object obj=new Object[5];


// int a[]= {2,3,4};
    // int a[]= new int[4];
    // a[0]=5;
    //  a[1]=5;
    //   a[2]=5;
    //    a[3]=5;
    // String a[]={"navin", "rahul" ,"rsmesh"};
    // String a[]=new String[3];
    // a[0]="ramesh";
    // a[1]="rahul";
    // a[2]="resul";
    // for(int i=0;i<3;i++)
    // {
    // System.out.println(a[i]);
    // }



}
}

public static void add(int[] a)
{
    int sum=sum+0;
    for(int i=0;i<=a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("the sum is ::"+sum);
}
