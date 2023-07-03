
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException  {
        java.lang.String string = "C:\\Users\\admin\\Desktop\\New folder\\new.txt";
        java.lang.String myfile=string;
        File file = new File(myfile);
        Scanner txt= new Scanner(file);
        while(txt.hasNextLine()){
            java.lang.String line=txt.nextLine();
            System.out.println(line);
        }
        txt.close();
    }
}
