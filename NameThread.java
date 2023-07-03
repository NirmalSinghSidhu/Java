public class NameThread extends Thread {
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        NameThread th1=new NameThread();
        NameThread th2= new NameThread();

        System.out.println(th1.getName());
        System.out.println(th2.getName());

        th1.setName("First");
        th2.setName("Second");
        th1.start();
        th2.start();
        System.out.println(th1.getName());
        System.out.println(th2.getName());

    }
    
}
