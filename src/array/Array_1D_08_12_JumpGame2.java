package array;

public class Array_1D_08_12_JumpGame2 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
        static   public int jump(int[] nums) {
            int n = nums.length;
            if (n <= 1) return 0;

            int jumps = 0;
            int currEnd = 0;
            int maxReach = 0;

            // Process indices until second last.
            for (int i = 0; i < n - 1; i++) {
                maxReach = Math.max(maxReach, i + nums[i]);

                // End of current range => commit one jump.
                if (i == currEnd) {
                    jumps++;
                    currEnd = maxReach;

                    // If this range already covers last index, stop.
                    if (currEnd >= n - 1) break;
                }
            }

            return jumps;
        }
    }