package allprogramme;

/**
 * 18. Sum Calculator
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 **/

public class P18SumCalculator {
    double firstNumber;   // 2 variable
    double secondNumber;

    // Instance method
    public double getFirstNumber() {           //   1 method
        return firstNumber;

    }

    public double getSecondNumber() {         //2 method
        return secondNumber;

    }
                     //setFirstNumber with one parameter of type double,
    public void setFirstNumber(double firstNumber) {  //3 method
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {  //4 method
        this.secondNumber = secondNumber;

    }
    public double getAdditionResult() {                   // 5 method
        double total = this.firstNumber + this.secondNumber;
        return total;
    }

    public double getSubstractionResult() {           // 6 method
        double total = this.firstNumber - this.secondNumber;
        return total;
    }

    public double getMultiplicationResult() {          // 7 method
        double total = this.firstNumber * this.secondNumber;
        return total;
    }

    public double getDivisionResult() {             // 8 method
        double division= this.firstNumber / this.secondNumber;
        if (this.secondNumber == 0) {
            division = 0;
        } else {
            division = this.firstNumber / this.secondNumber;
        }
        return (division);
    }

    public static void main(String[] args) {         // main method
        P18SumCalculator calculator = new P18SumCalculator();  // object calling
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("addition= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubstractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}