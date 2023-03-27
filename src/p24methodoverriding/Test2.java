package p24methodoverriding;

public class Test2 {

    public static void main(String[] args) {
        SBIClass s = new SBIClass();
        ICICIClass i = new ICICIClass();
        AXISClass a = new AXISClass();
        System.out.println("SBI rate of interest: "+s.getRateOfInterest());
        System.out.println("ICICI rate of interest: "+i.getRateOfInterest());
        System.out.println("AXIS rate of interest:" + a.getRateOfInterest());
    }
}
