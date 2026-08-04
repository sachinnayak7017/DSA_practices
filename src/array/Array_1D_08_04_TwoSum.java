package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_1D_08_04_TwoSum {
    public static void main() {
       // Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {3,9,-7,2,3,-5,2};
/*****************************************************/
        int target = 5;

       for(int i =0; i< arr.length;i++ ){
            for(int j =i+1; j< arr.length; j++){
                if(target == (arr[i]+arr[j])) {
                    System.out.println(i+" "+j);
               } break;
            }
        }
        System.out.println(" ");
    }
}
