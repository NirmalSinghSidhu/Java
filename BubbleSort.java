import java.util.Scanner;

public class BubbleSort {
    public static void sort(int []arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int A[],int n){
        for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []A= new int[50];
        int n;
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();

        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array Before Sortting:");
        printArray(A, n);
        sort(A, n);
        System.out.println("Array After Sortting:");
        printArray(A, n);

    }
}
