package array;

import java.util.Arrays;

public class Array_1D_08_05_SingleNumber {

    public static void main(String[] args) {

        int[] nums = {2,3,4,1,2,3,4};

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                return;
            }
        }

        // If no mismatch was found, the last element is the single number
        System.out.println(nums[nums.length - 1]);
    }
}