package oop;

public class Rectangle implements Shape{
    private int width;
    private int lenght;

    public Rectangle(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public void draw() {
        System.out.println("I draw Rectangle with width = "+this.width+", lenght = "+this.lenght);
    }

    @Override
    public double getPerimetr() {
        return 2*(this.lenght+this.width);
    }

    @Override
    public double getArea() {
        return this.lenght*this.width;
    }

    @Override
    public String getInfo() {
        return "I a Rectangle with width = "+this.width+", lenght = "+this.lenght;

    }
}
