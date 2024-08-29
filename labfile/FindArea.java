class Point {
void display() {
System.out.println("All shapes are formed with combinations of points");
}
}
class Shape extends Point {
void display() {
System.out.println("There are various types of shapes.");
}
void printArea(double l1, double l2) {
}
}
class Rectangle extends Shape {
void display() {
System.out.println("This is a rectangle.");
}
void printArea(double l, double b) {
double area = l * b;
System.out.println("Area of rectangle is : " + area);
}
}
class Square extends Shape {
void display() {
System.out.println("This is a square.");
}
void printArea(double s, double x) {
double area = s * s;
System.out.println("Area of square is : " + area);
}
}
class Circle extends Shape {
void display() {
System.out.println("This is a circle.");
}
void printArea(double r, double x) {
double area = 3.14 * r * r;
System.out.println("Area of circle is : " + area);
}
}
class Ellipse extends Shape {
void display() {
System.out.println("This is an ellipse.");
}
void printArea(double a, double b) {
double area = 3.14 * a * b;
System.out.println("Area of ellipse is : " + area);
}
}
class Triangle extends Shape {
void display() {
System.out.println("This is a triangle.");
}
void printArea(double base, double height) {
double area = (base * height) / 2;
System.out.println("Area of triangle is : " + area);
}
}
public class FindArea {
public static void main(String[] args) {
System.out.println("Rohan kumar");
System.out.println("2821185");
Point p = new Point();
p.display();
Shape s = new Shape();
s.display();
Rectangle r = new Rectangle();
r.display();
r.printArea(20, 16);
Square sq = new Square();
sq.display();
sq.printArea(5, 5); // Pass the same side length for square (since its a square)
Circle c = new Circle();
c.display();
c.printArea(5, 5); // Pass the radius for the circle
Ellipse e = new Ellipse();
e.display();
e.printArea(15, 6);
Triangle t = new Triangle();
t.display();
t.printArea(5, 6);
}
}