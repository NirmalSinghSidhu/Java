public class Singleton {
    private static Singleton singleton_instance=null;
    public String s;
    
    private Singleton(){
        s="hello I m the String in the singleton class";
    }

    public static Singleton getInstace(){
        if(singleton_instance==null){
            singleton_instance=new Singleton();
        }
        return singleton_instance;
    }

    public static void main(String[] args) {
        Singleton x=Singleton.getInstace();
        Singleton y=Singleton.getInstace();
        Singleton z=Singleton.getInstace();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        if(x==y&&y==z){
            System.out.println("objects points to the same location");
        }

        System.out.println("string from the object x is "+x.s);
        System.out.println("string from the object y is "+y.s);
        System.out.println("string from the object z is "+z.s);
    }
}
