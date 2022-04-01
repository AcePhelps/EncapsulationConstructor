package oop;

public class circle implements Shape{
    private int radius;

    public circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("I draw a circle with radius"+this.radius);
    }

    @Override
    public double getPerimetr() {
        return 2*this.radius*Math.PI;

    }

    @Override
    public double getArea() {
return this.radius*this.radius*Math.PI;
    }

    @Override
    public String getInfo() {
        return "I'm a circle with radius = "+this.radius;

    }
}
