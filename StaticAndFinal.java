class Student{
public java.lang.String name;
public static java.lang.String  studentClass;
public static final int  MYCONST = 34;
public static int count =0;
public Student(){
    count++;
}
public void studentName(){
     System.out.println(name + " is enrolled in " + studentClass);
 }
 public static void classInfo(){
     //static method can use or access static variable only
    System.out.println(studentClass);
    // this gives you an error System.out.println(name);
 }
}
public class StaticAndFinal{
 public static void main(String[] args) {
     Student.studentClass= "java programming";
     Student.classInfo();
     System.out.println("value of count before creating objects "+ Student.count);
     Student st1= new Student();
     Student st2= new Student();
     System.out.println("value of count After creating objects "+ Student.count);

     st1.name="Steven";
     st2.name="danial";
    st1.studentName();
    st2.studentName();
    System.out.println(Math.E); // constant
    System.out.println(Student.MYCONST);
 }
 }
