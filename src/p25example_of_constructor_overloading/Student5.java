package p25example_of_constructor_overloading;

//Java program to overload constructors
public class Student5 {
    int id;
    String name;
    int age;
    // creating two args constructors
    Student5(int i ,String n){
        id = i;
        name = n;
    }
    // creating three args constructors
    Student5(int i , String n,int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){  // instance method
        System.out.println(id + ""+ name + "" +age);{

        }
    }
    public static void main(String[] args) {
        Student5 s1 = new Student5(111 ,"  karan ");  //object calling
        Student5 s2 = new Student5(222 ,"  Aryan ",25);
        s1.display();
        s2.display();
    }
}
