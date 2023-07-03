    
public class Arr {
    public static void main(String[] args) {
        char[] a  = new char[5];
        a[0]='a';
        a[1]='h';
        a[2]='n';
        a[3]='b';
        a[4]='c';
        /*for( int i=0;i<5;i++){
            System.out.println(a[i]);
        }*/
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = new int[5];
        for(int i=0;i<5;i++){
            b[i]=i;
        }
        for(int i=0;i<5;i++){
          System.out.println(b[i]);
        }
        int num=5;
        for(int i=0;i<5;i++){
            c[i]=num;
            num++;
        }
        for(int i=0;i<5;i++){
            System.out.println(c[i]+"\n");
          }
          for(int i=0;i<5;i++){
            d[i]=b[i]+c[i];
        }
        for(int i=0;i<5;i++){
            System.out.println(d[i]);
          }
      int[][] e= new int[3][3];
      for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
            e[i][j]=num;
            num++;
          }
      }
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          System.out.println(e[i][j]+"\t");
        }
    }
    }
}

