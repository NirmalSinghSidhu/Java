public class Function {
    public static void main(String[] args) {
        sparta();
        sparta();
        add(22, 43);
        add(2, 3);
        Function o1= new Function();
        int g=o1.add1(3, 454);
        System.out.println(g);
        swapp(3, 78);
        area(10);
        area(3,5);
    }
    public static void sparta(){
        System.out.println("Thid is sparrtaaa...");
    }
    public static void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    public int add1(int x,int y){
        int r=x+y;
        return r;
    }
    public static void swapp(int a,int b){
        int c=a;
        a=b;
        b=c;
        System.out.println("a is "+ a+" b is "+ b);
    }
    public static void area(int x,int y){
    int r=x*y;
    System.out.println("area of rectangle is" + r);
    }
    public static void area(float x){
        float r=(float) (3.14*x*x);
        System.out.println("area of circle is" + r);
        }
}
