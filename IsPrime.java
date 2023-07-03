import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be checked for Prime..");
        int n=sc.nextInt();
        int div=2;
        while(div<=n-1){
            if(n%div==0){
                System.out.println(n+" is not a Prime number");
                break;
            }
            div=div+1;
        }
        if(div==n){
            System.out.println(n+" is a Prime Number");
        }
    }
}
