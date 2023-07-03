 class Student{
    static String college="Pu Patiala";
    int rollNo;
    String name;
    Student(int r,String n){
        rollNo=r;
        name=n;
    }
    static void change(String coll){
        college=coll;
    }
    public void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
    Student(){

    }
}
class Counter{
    static int count=0;
    Counter(){
       count++;
        System.out.println(count);
    }
}
public class TestStatic {
    public static void main(String[] args) {
        Student s1=new Student(112, "Mamta");
        s1.display();
        Student s2=new Student(113, "Shona");
        s2.display();
        Student.change("uni patiala");
        Student s3=new Student(12, "Nobita");
        s3.display();
        Student s4 = new Student(13,"Doreamon");
        s4.display();
        Student s5=new Student();
        s5.display();
        s5.name=s4.name;
        s5.rollNo=s4.rollNo;
        s5.display();
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        
    }
}
