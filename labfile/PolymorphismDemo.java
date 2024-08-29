class Shape {
void draw() {
System.out.println("Drawing a generic shape");
}
}
class Circle extends Shape {
@Override
void draw() {
System.out.println("Drawing a circle");
}
}
class Rectangle extends Shape {
@Override
void draw() {
System.out.println("Drawing a rectangle");
}
}
class Triangle extends Shape {
@Override
void draw() {
System.out.println("Drawing a triangle");
}
}
public class PolymorphismDemo {
public static void main(String[] args) {
System.out.println("Kanhaiya kumar");
System.out.println("2821230");
Shape shape1 = new Circle();
Shape shape2 = new Rectangle();
Shape shape3 = new Triangle();
shape1.draw(); // Calls Circle's draw method
shape2.draw(); // Calls Rectangle's draw method
shape3.draw(); // Calls Triangle's draw method
}
}