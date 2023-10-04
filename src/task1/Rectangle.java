package task1;

public class Rectangle extends Shape{
    private double a, b;
    private double Area;
    private double Perimeter;
    private String Type;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        Area = a*b;
        return Area;
    }
    @Override
    public double getPerimeter() {
        Perimeter = 2 * a + 2 * b;
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
