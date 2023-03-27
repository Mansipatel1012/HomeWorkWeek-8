package p19cylinder;

public class Circle {
    double radius;         // one variable

                           // constructors
    //one constructor with parameter radius of type double
    Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    // Instance method without any parameter
    public double getRadius() {
        return radius;
    }
    public double getArea() {   // Instance method without any parameter
        double area = radius * radius * Math.PI;
        return area;
    }
}