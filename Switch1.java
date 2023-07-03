import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args)
    {
        try (var input = new Scanner(System.in)) {
            System.out.println("Enter the day;");

              int t = input.nextInt();
               switch(t)
               {
               case 1:
               System.out.println("its monday");
                break;
                case 2:
               System.out.println("its tuesday");
                break;
                case 3:
                System.out.println("its wenesday");
                 break;
                 case 4:
               System.out.println("its thursday");
                break;
                case 5:
               System.out.println("its Saturday");
                break;
                case 6:
               System.out.println("its sonday");
                break;
                default:
                System.out.println("error");
               }
        }
}

    }

