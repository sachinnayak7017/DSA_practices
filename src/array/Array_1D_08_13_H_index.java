package array;

import java.util.Arrays;

public class Array_1D_08_13_H_index {

    public static void main(String[] args) {
        int[] nums = {6,3,1,0,5,};
        System.out.println(hIndex(nums));
    }
        static  public int hIndex(int[] citations) {
            Arrays.sort(citations);

            int n = citations.length;

            for (int i = 0; i < n; i++) {

                int papers = n - i;

                if (citations[i] >= papers) {
                    return papers;
                }
            }

            return 0;

        }
    }