package p17carpetcostcalculator;

public class Floor {
    double width;
    double length;                          // 2 variable
    Floor(double width, double length) {    // one  constructors with parameters
        this.width = width;
        this.length = length;
        if (width<0 && length < 0) {
            this.width = 0;
            this.length = 0;
        }else {
            this.width = width;
            this.length = length;
        }
        } public double getArea(){         // instance method
            double area = width * length;
            return area;
        }
    }
