
public class Inheritance {
public static void main(String[] args) {
    Factory f1= new Factory();
    f1.build();
    f1.design();
    Car c1= new Car();
    c1.build();
    c1.design();  
    c1.speed();
}
}