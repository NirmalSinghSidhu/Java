class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
    Operation op;
    double pi=3.14;
    double area(int rad){
        op=new Operation();
        int r=op.square(rad);
        return pi*r;
    }
}
public class AggregatioTest {
    public static void main(String[] args) {
        Circle c1= new Circle();
        double ar=c1.area(10);
        System.out.println(ar);
    }
}
