import java.util.Scanner;

public class Sum_Even_Odd_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumE=0;
        int sumO=0;
        while(n!=0){
            int rem=n%10;
            if(rem%2==0){
                sumE+=rem;
            }
            else{
                sumO+=rem;
            }
            n=n/10;
        }
        System.out.println(sumE+" "+sumO);
    }
}
