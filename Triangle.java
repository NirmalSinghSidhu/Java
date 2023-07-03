import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
	 int n=sc.nextInt();
	 int i=1;
	 while(i<=n){
		 int p=i;
		 while(p>=1){
			 System.out.print(p);
			 p--;
		 }
		 i++;
		 System.out.println();
	 }
	}
    }
