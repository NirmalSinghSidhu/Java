class ArrayTwoDim{
    public static void print2dArray(int A[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        a[0][0]=23;
        a[0][1]=34;
        a[0][2]=323;
        a[1][0]=23;
        a[1][1]=34;
        a[1][2]=323;
        a[2][0]=23;
        a[2][1]=34;
        a[2][2]=323;

        //printing the arrray using the above function
        print2dArray(a,3,3);

        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        //copying an array to another

        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=b[i][j];
            }
        }

        //printing the copied array
        System.out.println("Array after copy");
        print2dArray(c, 3, 3);
        
        //Adding two arrays
        int [][]d= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=c[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of two Arrays");
        print2dArray(d, 3, 3);
        //jagged array in the java

        int e[][]=new int [3][];
        e[0]=new int[3];
        e[1]=new int[5];
        e[2]=new int[2];
          
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<e[i].length;j++){
                e[i][j]=count++;
            }
        }

        //printing the jagged array
        System.out.println("Printing the jagged Array");
        for(int i=0;i<3;i++){
            for(int j=0;j<e[i].length;j++){
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
        //Getting the class name of the where array object is placed
        Class c1=e.getClass();
        String name = c1.getName();
        System.out.println(name);

        char ch[]={'a','s','f','g','h','i','j','k','l'};
        char chnew[]= new char[5];
        System.arraycopy(ch, 2, chnew, 0, 5);
        System.out.println("Printing the copied Array");
        for(int i=0;i<chnew.length;i++){
            System.out.print(chnew[i]+" ");
        }
        char ch2[]=ch.clone();
        System.out.println("Printing the clone of ch[][]");
        for(int i=0;i<ch2.length;i++){
            System.out.print(ch2[i]+" ");
        }
        System.out.println();
        System.out.println(ch==ch2);
        //Multiplication of the 2 arrrays
        int m[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=0;
                for(int k=0;k<3;k++){
                    m[i][j]=c[i][k]*b[k][j];
                }
            }
        }
        print2dArray(m, 3, 3);

    }
}