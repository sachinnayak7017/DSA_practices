package array;

import java.util.Arrays;

public class Array_1D_08_06_ArrayList {

    public static void main(String[] args) {

        int[] nums = {1,5,1,1,6,4};
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        int left=(n-1)/2;
        int right=n-1;
        for(int i=0;i<n;i+=2){
            nums[i]=temp[left];
            left--;
        }
        for(int i=1;i<n;i+=2){
            nums[i]=temp[right];
            right--;
        }


        for(int arr : nums){
            System.out.print(arr+ " ");
        }
    }
}