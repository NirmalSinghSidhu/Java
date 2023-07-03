class Animal{
    void eat(){
        System.out.println("Eating.....");
    }
}
class  Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}
class babyDog extends Dog{
    void weep(){
        System.out.println("Weeping....");
    }
}
public class TestInheritance2 {
    public static void main(String[] args) {
       Dog d1=new Dog();
       d1.bark();
       d1.eat(); 
       babyDog b1=new babyDog();
       b1.bark();
       b1.eat();
       b1.weep();
    }
}
