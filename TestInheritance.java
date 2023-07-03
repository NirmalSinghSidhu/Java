class Employee{
int id;
String name;
static int salary=200000;
}
public class TestInheritance extends Employee{
    int bonus;
    TestInheritance(String n,int id,int b){
        super.name=n;
        super.id=id;
        bonus=b;
    }
    public void display(){
      System.out.println("Total Diwali payement for "+name+" of id number "+id+" is "+(bonus+salary));
    }
    public static void main(String[] args) {
        TestInheritance t1= new TestInheritance("Doreamon",123, 34);
        TestInheritance t2=new TestInheritance("Nobita", 124, 35);
        t1.display();
        t2.display();
    }
}
