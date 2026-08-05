package array;

import java.util.Scanner;

public class Array_1D_08_05_RotateArray {
    public static void main() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter array size:");
//        int[] arr = new int[sc.nextInt()];
//        System.out.println("please enter array element :");
//        for(int i =0;i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr = {7, 2, 5, 4, 6, 8, 9, 0, 1, 3};
        //rotate first one  then rotate second one then whole rotate arr using swaping
/*****************************************************/
        int k = 3;
        int n = arr.length-1;
        k = k % arr.length;
        revers(arr,0,n-k);
        revers(arr,n-k+1,n);
        revers(arr,0,n);
        for(int i =0;i<=n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void revers(int[] arr, int start, int end){
       while(start < end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
        start++;
        end--;
    }}
}
