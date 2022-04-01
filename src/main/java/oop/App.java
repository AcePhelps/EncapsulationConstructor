package oop;

public class App {
    public static void main(String[] args) {
        circle c1 = new circle(5);
        Shape c2 = new circle(7);
        Rectangle r1 = new Rectangle(5,6);
        Shape r2 = new Rectangle(8,2);
        Square s1 = new Square(8);
        Shape s2 = new Square(5);
        Rectangle s3 = new Square(3);


        r1.draw();
        s3.draw();
        s1.getArea();

        Shape[] shapes = {c1,c2,r1,r2,s1,s2,s3,new Square(9)};


        double area = 0;
        for(Shape shape :shapes){
            area= shape.getArea()+area;
        }
        System.out.println("Sum of all areas  = "+area);
    }
}
