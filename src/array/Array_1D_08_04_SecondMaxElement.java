package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1D_08_04_SecondMaxElement {
    public static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {7,9,9,-7,2,3,-5,8};
/*****************************************************/
        //Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        for(int i =0; i< arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
        }
        for(int i =0; i< arr.length;i++){
            if(second<arr[i] && max != arr[i]){
                second =arr[i];
            }
        }
        System.out.println(max);
        System.out.println(second);
    }
}
