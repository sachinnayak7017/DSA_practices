package array;

import java.util.Scanner;

public class Array_1D_08_03_Max_Min_Element {
    public static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {3,9,-7,2,3,-5,2};
/*****************************************************/
        //int max =0;
        int max = Integer.MIN_VALUE;
        for(int j =0;j<arr.length;j++){
            if(max<arr[j]) max =arr[j];
        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;
        for(int j =0;j<arr.length;j++){
            if(max>arr[j]) max =arr[j];
        }
        System.out.println(max);
    }
}
