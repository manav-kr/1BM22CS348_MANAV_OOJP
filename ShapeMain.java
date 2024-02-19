/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( )Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. Each one of the classes contain only the method printArea( ) that prints the area of the given shape. */
import java.util.*;
abstract class Shape{
    int dim1;
    int dim2;

    Shape(int dim1, int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
abstract void printArea();
}
class Rectangle extends Shape{
    Rectangle(int length, int width){
        super(length,width);
    }
    void printArea(){
        double area=dim1*dim2;
        System.out.println("Area of Rectangle : "+area);
    }
}
class Triangle extends Shape{
    Triangle(int base, int height){
        super(base,height);
    }
    void printArea(){
        double area=0.5*dim1*dim2;
        System.out.println("Area of Triangle : "+area);
    }
}
class Circle extends Shape{
    Circle(int radius){
        super(radius,0);
    }
    void printArea(){
        double area=Math.PI *dim1*dim1;
        System.out.println("Area of Circle : "+area);
    }
}
public class ShapeMain{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle:");
        int length = in.nextInt();
        System.out.print("Enter Width of Rectangle:");
        int width = in.nextInt();
        System.out.print("Enter Base of Triangle:");
        int base =in.nextInt();
        System.out.print("Enter Height of Triangle:");
        int height = in.nextInt();
        System.out.print("Enter Radius of Circle:");
        int radius=in.nextInt();
        Rectangle rectangle = new Rectangle(length,width);
        Triangle triangle=new Triangle(base,height);
        Circle circle = new Circle(radius);
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();

    }
}
