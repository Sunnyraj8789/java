public class printMult {

    public static void mult(int n,int k)
    {
        if(k==1)
        {
            System.out.println(n);
            return;
        }

        mult(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        int n=24,k=5;
        mult(n,k);
        System.out.println();
    }
    
}
