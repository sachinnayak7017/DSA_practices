package array;

public class Array_1D_08_9_Merge2sortedarray {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 8};
        int[] nums2 = {2, 4, 6, 9, 10};

        int n = nums.length;
        int m = nums2.length;

        int[] arr = new int[n + m];

        int k = 0;  // nums pointer
        int j = 0;  // nums2 pointer

        for (int i = 0; i < arr.length; i++) {

            if (k >= n) {
                arr[i] = nums2[j];
                j++;
            }
            else if (j >= m) {
                arr[i] = nums[k];
                k++;
            }
            else if (nums[k] < nums2[j]) {
                arr[i] = nums[k];
                k++;
            }
            else {
                arr[i] = nums2[j];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}