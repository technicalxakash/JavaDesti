package www.pillarsOfOops.com;




import java.util.Scanner;

abstract class Shapes{
     double area;
     Scanner sc = new Scanner(System.in);
    abstract void collect();
    abstract void cal();
    void display(){
        System.out.println("area :"+area);
    }
}
class Circle extends Shapes{
    private double pi = 3.14;
    private double radius;
    @Override
    void collect() {
        System.out.println("enter the radius");
         radius = sc.nextDouble();

    }

    @Override
    void cal() {
        area = pi*radius;
    }
}
class Rectangle extends Shapes{
private double l,b;
    @Override
    void collect() {
        System.out.println("enter the length");
        l = sc.nextDouble();
        System.out.println("enter the breadth");
        b = sc.nextDouble();
    }

    @Override
    void cal() {
        area = l * b;
    }
}

class Square extends Shapes{
private double side;
    @Override
    void collect() {
        System.out.println("enter the side");
        side = sc.nextDouble();
    }

    @Override
    void cal() {
        area = side * side;
    }
}

class Geometry{
    void permit(Shapes s){
       s.collect();
       s.cal();
       s.display();
    }
}

public class OOPs {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        Geometry geometry = new Geometry();
        geometry.permit(circle);
        System.out.println("==================================");
        geometry.permit(rectangle);
        System.out.println("==================================");
        geometry.permit(square);

    }
}