class Student{
    public String name;
    public String age;
}
public class Contructor1 {
    public static void main(String[] args) {
        Student st1 =new Student();
        Student st2 = new Student();
        st1.name="daniel";
       System.out.println(st1.name);
       System.out.println(st2.name);
    }
}
