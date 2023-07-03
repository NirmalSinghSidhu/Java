public class BinarySearch {
    public static int searchBinary(int []A,int s,int e,int k){
        int mid=(s+e)/2;
        while(s<e){
            if(A[mid]==k){
              return mid;
            }
            if(A[mid]>k){
              e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int A[]={1,3,45,67,90,234};
        System.out.println("Heloo");
        int ind=searchBinary(A, 0, 5, 90);
        System.out.println(ind);
    }
}
