package p20poolarea;
                               //The name Cuboid that extends Rectangle class.
public class Cuboid extends Rectangle {

    double height;             // one variable
                              // one constructor with three parameters width, length, and height
    Cuboid(double width, double length, double height) {
        super(5, 10);
        this.height = height;
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }                             //two instance method without any parameter
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }
}
