public class complexnumber {
private double real;
private double imaginary;
private static int activeObjectsCount = 0;
// Constructor
public complexnumber(double real, double imaginary) {
this.real = real;
this.imaginary = imaginary;
activeObjectsCount++;
}
// Get the number of active objects
public static int getActiveObjectsCount() {
return activeObjectsCount;
}
// Get the real part of the complex number
public double getReal() {
return real;
}
// Get the imaginary part of the complex number
public double getImaginary() {
return imaginary;
}
// Add two complex numbers
public complexnumber add(complexnumber other) {
return new complexnumber(this.real + other.real, this.imaginary +
other.imaginary);
}
// Subtract two complex numbers
public complexnumber subtract(complexnumber other) {
return new complexnumber(this.real - other.real, this.imaginary -
other.imaginary);
}
// Multiply two complex numbers
public complexnumber multiply(complexnumber other) {
double newReal = (this.real * other.real) - (this.imaginary *
other.imaginary);
double newImaginary = (this.real * other.imaginary) + (this.imaginary
* other.real);
return new complexnumber(newReal, newImaginary);
}
// Convert the complex number to a string
@Override
public String toString() {
if (imaginary >= 0) {
return real + " + " + imaginary + "i";
} else {
return real + " - " + (-imaginary) + "i";
}
}
public static void main(String[] args) {
System.out.println("sunny kumar");
System.out.println("2821106");
complexnumber num1 = new complexnumber(3.0, 4.0);
complexnumber num2 = new complexnumber(1.0, 2.0);
complexnumber sum = num1.add(num2);
complexnumber difference = num1.subtract(num2);
complexnumber product = num1.multiply(num2);
System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);
System.out.println("Active objects count: " +
complexnumber.getActiveObjectsCount());
// Creating another complex number
// ComplexNumber num3 = new ComplexNumber(5.0, 6.0);
System.out.println("Active objects count: " +
complexnumber.getActiveObjectsCount());
}
}
