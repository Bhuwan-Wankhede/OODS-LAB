
import java.util.Scanner;

abstract class Shape {
     int width;
     int height;
    
    public Shape(int w, int h) {
        width = w;
        height = h;
    }
    
    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int w, int h) {
        super(w, h);
    }
    
    public void printArea() {
        int area = width * height;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int w, int h) {
        super(w, h);
    }
    
    public void printArea() {
        double area = 0.5 * width * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    public Circle(int w, int h) {
        super(w, h);
    }
    
    public void printArea() {
        double radius = width / 2.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the width and height of the rectangle:");
        int width = input.nextInt();
        int height = input.nextInt();
        
        Rectangle r = new Rectangle(width, height);
        r.printArea();
        
        System.out.println("\nEnter the base and height of the triangle:");
        int base = input.nextInt();
        height = input.nextInt();
        Triangle tr= new Triangle(base, height);
        tr.printArea();
        
        System.out.println("Enter the diameter of the circle:");
        int diameter = input.nextInt();
         Circle c = new Circle(diameter, diameter);
        c.printArea();
    }
}
