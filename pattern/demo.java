public class demo {
    public static void main(String[] args) {
        int n=9;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==1||j==1||i==n||j==n||i+j==n-(n/3)||j-i==(n-1)/2||i-j==(n-1)/2||i+j==n+((n+1)/2)||j==5||j==4<=6||j==3<=7||j==2<=8||j<=9)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
            }
    }
}

