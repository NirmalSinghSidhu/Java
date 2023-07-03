import java.util.Scanner;

public class CharacterPatterrn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            char p =(char)('A'+i-1); ;
            for (int j=1;j<=i;j++){
                p++;
            }
            System.out.println();
        }
    }
}
