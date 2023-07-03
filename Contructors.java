class Program{
    int value;
    private String txt;
 public  Program() {
     this(6);
     System.out.println("this is my first connstructor");
     value=12;
 }
 public Program(int value){
     this.value=value;
     System.out.println("second constructor");
 }
 public Program(int value,String txt){
     this.value=value;
     this.txt=txt;
     System.out.println("third constuctor");
 }
}
public class Contructors {
    public static void main(String[] args) {
        Program myprogarm =new Program();
        Program myProgram1= new Program(2);

}

}
