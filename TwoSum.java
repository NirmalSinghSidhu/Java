public class TwoSum {
    public static int[] sum(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            for(int j=i+1;j<nums.length;j++){
                int q=nums[j];
                if(p+q==target){
                    int arr[]={p,q};
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException("No match fornd");
    }
    public static void main(String[] args) {
        int []nums = {3,2,4}; 
        int target = 6;
        System.out.println(sum(nums, target));
     
    }
}
