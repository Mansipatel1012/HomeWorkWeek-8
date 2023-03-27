package p26encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {

        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("mansi");
        obj.setAge(30);
        obj.setRollNo(24);

        // Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's name: " + obj.getAge());
        System.out.println("Prime's name: " + obj.getRollNo());
    }
}
