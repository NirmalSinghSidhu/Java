public class Arrays1 {
    public static void main(String[] args) {
        int[] numbers = new  int[7];
        numbers[0]=34;
        numbers[1]=34; 
        numbers[3]=3;
        numbers[2]=35654;
        numbers[4]=3;
        numbers[5]=4;
        numbers[6]=374;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        int[] b={1,2,3,3,7};
         for (int element : b) {
            System.out.println(element);
        }

    }

    /**
     *
     */
    
    
}
