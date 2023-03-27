package p17carpetcostcalculator;

public class Carpet {
    double cost;        // one variable

    Carpet(double cost) {  // constructors
        this.cost = cost;
        if (cost < 0) {
            this.cost = 0;
        }else {
            this.cost=cost;
        }
    }  public double getCost(){
            return cost;
        }
    }


