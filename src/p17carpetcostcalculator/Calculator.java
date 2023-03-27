package p17carpetcostcalculator;

public class Calculator {
    Floor floor;                   //2 variable
    Carpet carpet;

    Calculator(Floor floor,Carpet carpet){     // one costructors
        this.carpet=carpet;
        this.floor=floor;
    }
    public double getTotalCost(){             // one instance method
        double total=floor.getArea()*carpet.getCost();
        return total;
    }
}
