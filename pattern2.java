import java.util.*;;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=n;
        while(i>=1){
            int j=i;
            char ch=(char)('A'+i-1);
            while(j<=n){
                System.out.print(ch);
                j++;
                ch++;
            }
            System.out.println();
            i--;
        }
    }
}
