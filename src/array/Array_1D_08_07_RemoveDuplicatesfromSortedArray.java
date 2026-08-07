package array;

public class Array_1D_08_07_RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k =0;
        for(int i =1; i < nums.length;i++){
            if(nums[k]!= nums[i]){
                System.out.println("first"+k);
                k++;
                System.out.println(k);
                nums[k]=nums[i];

            }
        }
        for (int arr : nums){
            System.out.print(arr + " ");
        }
        System.out.println("length :" +k+1);
    }


}