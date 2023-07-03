public class Main {
    public static void main(String[] args) {
        Smartphone o1=new Smartphone();
        o1.call();
        o1.gaming();
    }
    
}
 class Phone {
    public void call(){
 System.out.println("calling");
     }   
 } 
 class Smartphone extends Phone {
     public void gaming(){
        System.out.println("gaming");
    }
    }
