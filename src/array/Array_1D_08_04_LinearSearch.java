package array;

import java.util.Scanner;

public class Array_1D_08_04_LinearSearch {
    public static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {3,9,-7,2,3,-5,2,4};
/*****************************************************/
        int target = 90;
        boolean flag = false;
        for(int i =0; i< arr.length;i++){
            if(arr[i]== target) flag =true;
            break;
        }
        System.out.println(flag);
    }
}
