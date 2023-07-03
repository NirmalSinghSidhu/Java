
public class TerneryClass {
    public static void main(String[] args) {
        int number =7674;
        number=number<100?number:100;
        System.out.println(number);
        int[] arr={2,56,78,598,54};
        int max=Integer.MIN_VALUE;
       for(int element:arr){
        max =max>element?max:element;
       }
       System.out.println("The  maximum value in the arary is => "+max);
    }
    
}
