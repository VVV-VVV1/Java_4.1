package task1;

import static java.lang.Math.pow;
public class Square extends Shape{
    private double a;
    private double Area;
    private double Perimeter;
    private String Type;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        Area =  pow(a, 2.00);
        return Area;
    }
    @Override
    public double getPerimeter() {
        Perimeter = 4*a;
        return Perimeter;
    }

    @Override
    public String getType() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public String toString(){
        return "Type: " + getType() +
                ", Area: " + getArea() +
                ", Perimeter: " + getPerimeter();
    }
}
