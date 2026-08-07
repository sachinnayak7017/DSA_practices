package array;

import java.util.ArrayList;

public class Array_1D_08_07_RemoveElement {

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        System.out.println(nums.length);
        int val = 3;
        int k =0;
        for(int i =0; i< nums.length;i++){
            if(val != nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(k);
    }


}