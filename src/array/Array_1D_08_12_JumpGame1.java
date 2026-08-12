package array;

public class Array_1D_08_12_JumpGame1 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
        static public boolean canJump(int[] nums) {
            int n  = nums.length;
            int reachable =0;
            for(int i =0; i<n ;i++){
                if(reachable < i) return false ;
                if(reachable <=i + nums[i]) reachable = i + nums[i];


            }
            return true;
        }
    }