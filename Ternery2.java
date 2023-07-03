public class Ternery2 {
    public static void main(String[] args) {
        int min= Integer.MAX_VALUE;
        int[] arr ={23,34,5,12,76,87,23,111,45};
        for(int element:arr){
            min=element<min?element:min;
        }
System.out.println("Minimum element in the array is ..."+min);
    }
}
