import java.util.Scanner;

public class alternate {

    public static int AlternateSumFind(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num %2 == 0)
        {
            return AlternateSumFind(num-1)-num;
        }

        else{
            return AlternateSumFind(num-1)+num;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int result=AlternateSumFind(num);
        System.out.println("sum is :- "+result);
    }
    
}
