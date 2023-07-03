import java.util.Scanner;

public class application{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char ch=str.charAt(0);
        boolean b=Character.isUpperCase(ch);
        boolean b2=Character.isLowerCase(ch);
        if(b){
            System.out.println(1);
        }
        else if(b2){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }
    }
}
