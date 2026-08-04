package array;

import java.util.Scanner;

public class Array_1D_08_01_multiplication {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter array size:");
        int[] arr = new int[sc.nextInt()];
        System.out.println("please enter array element :");
        for(int i =0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(int j =0;j<arr.length;j++){
            System.out.print(arr[j] *2 + " ");
        }
    }
}
