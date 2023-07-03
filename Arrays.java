public class Arrays {
    //Returning a array using the method get() 
    public static int[] get(){
        return new int[] {1,2,3};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int b[]=get();
        for(int i:b){
            System.out.println(i);
        }
        for(int i:arr){
            System.out.println(i);
        }
        int arr2[]={50,60,70,80};  
        for(int i=0;i<arr2.length;i++){  
        System.out.println(arr2[i]);  
        }  
    }
}
