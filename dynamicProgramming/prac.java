import java.util.Scanner;

public class prac {
    public static int countsum(int n){
        if(n==1||n==2){
            return n;
        }
        else{
            return countsum(n-1)+countsum(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n=sc.nextInt();
        System.out.println("number of ways is :- "+countsum(n));
        }

    
}