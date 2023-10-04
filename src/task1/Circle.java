package task1;

import static java.lang.Math.pow;
public class Circle extends Shape{
    private double r;
    private double Area;
    private double Perimeter;
    private String Type;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        Area = 3.14 * pow(r, 2.00);
        return Area;
    }
    @Override
    public double getPerimeter() {
        Perimeter = 2 * 3.14 * r;
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
