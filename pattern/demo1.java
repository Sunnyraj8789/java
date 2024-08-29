public class demo1 {
    public static void main(String[] args) {
        int n=9;
        int number=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println("-------------------------------------");



        for(int i=1;i<=n;i++)
        {
            //space 
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            
            System.out.println();
        }


        System.out.println("-------------------------------------");



        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println("-------------------------------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

     System.out.println("----------------------------------------");

     for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


        
     System.out.println("----------------------------------------");
        

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+number);
                number++;
            }
            System.out.println();
        }


        
     System.out.println("----------------------------------------");


     
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum=i+j;
                if(sum%2==0)
                {
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }


        
     System.out.println("----------------------------------------");


     
        for(int i=1;i<=n;i++)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");                
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


         for(int i=n-1;i>=1;i--)
        {
            //space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");                
            }
            //stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        
     System.out.println("------------------------------------");



      for(int i=1;i<=n;i++)
        {

            //first part

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

           
            //space
             int space=2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");                
            }


            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //lower part
    

        
      for(int i=n-1;i>=1;i--)
        {

            //first part

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }


            //space
             int space=2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");                
            }


            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
