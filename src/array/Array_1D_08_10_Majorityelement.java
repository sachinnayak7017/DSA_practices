package array;

public class Array_1D_08_10_Majorityelement {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2,3,4,2,2};
        System.out.println(majorityElement(nums));
    }

       static public int majorityElement(int[] nums) {

            int candidate = 0;
            int count = 0;

            for (int num : nums) {

                if (count == 0) {
                    candidate = num;
                }
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }

            return candidate;
        }
    }

