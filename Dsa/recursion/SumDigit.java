import java.util.Scanner;

public class SumDigit {

    public static int SumofDigit(int num)
    {
        if(num==0)
        {
            return 0;
        }
        return (num%10)+SumofDigit(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit ");
        int num=sc.nextInt();
        int result=SumofDigit(num);
        System.out.println("sum of digit is :- "+result);
    }
    
}
