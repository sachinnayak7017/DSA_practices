package BasicSorts;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorts_08_17_commonelement {

     static public int[] findIntersectionValues(int[] nums1, int[] nums2) {

         int answer1 = 0;
         int answer2 = 0;

         // nums1 -> nums2
         for (int i = 0; i < nums1.length; i++) {

             for (int j = 0; j < nums2.length; j++) {

                 if (nums1[i] == nums2[j]) {
                     answer1++;
                     break;
                 }
             }
         }

         // nums2 -> nums1
         for (int i = 0; i < nums2.length; i++) {

             for (int j = 0; j < nums1.length; j++) {

                 if (nums2[i] == nums1[j]) {
                     answer2++;
                     break;
                 }
             }
         }

         return new int[]{answer1, answer2};
     }



    public static void main(String[] args) {
        int arr[]={2,3,2};
        int arr2[]={1,2};
//        selection_sort(arr,arr.length);
       // selection_sortrevers(arr,arr.length);
        System.out.println(findIntersectionValues(arr,arr2));

        for(int i:arr){
            System.out.print(i +" ");
        }
    }

}
