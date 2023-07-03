

public class Arrays2 {
    public static void main(String[] args) {
        int[] oned = {1,3,45,4};
        System.out.println(oned[3]);
        int[][] multd = {{1,3,4},{2,3,56},{32,56,7,34}};
        System.out.println(multd[2][3]);
        System.out.println(multd[0][2]);
        double[][] c= new double[2][3];
        System.out.println(c[1][2]);
        c[1][0]=3.4;
        System.out.println(c[1][0]);
        for(int i=0;i<multd.length;i++){
            for(int j=0;j<multd[i].length;j++){
            System.out.print(multd[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
