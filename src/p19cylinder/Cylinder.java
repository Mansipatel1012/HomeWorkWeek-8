package p19cylinder;

// the name Cylinder that extends Circle class
public class Cylinder extends Circle {
    double height;             // one variable

    Cylinder(double radius, double height) {           // one constructors
        super(5.55);
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {        // Instance method
        return height;
    }
    public double getVolume() {         // Instance method
        double volume = super.getArea() * height;
        return volume;
    }
}
