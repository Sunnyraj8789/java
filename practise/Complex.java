public class Complex
{
    double real, imag;
    Complex(double real, double imag) 
    {
        this.real=real;
        this.imag=imag; 
        System.out.println(this.real);
        System.out.println(this.imag);
        }
        static Complex add(Complex c1, Complex c2)
        {
            Complex temp=new Complex(0,0); 
            temp.real=c1.real + c2.real;
            temp.imag=c1.imag + c2.imag;
            return temp; 
            
        } 
        public static void main(String args[])
        {
             Complex c1=new Complex(7.9,11.5); 
             Complex c2=new Complex(4.5,1.5);
             Complex temp=add(c1,c2);
             System.out.printf("Sum is : %.1f +%.1fi",temp.real,temp.imag);
             }
                   }