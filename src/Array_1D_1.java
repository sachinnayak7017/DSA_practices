import java.util.Arrays;
import java.util.Scanner;

public class Array_1D_1 {
    public static void main(String[] args) {

     demo();
    }
    static void print(int[] arr){
        for(int i=1; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    static void demo(){
        int arr[] = {3,8,5,9,5,9,2,4,1,0};
        System.out.println("with out copy");
        print(arr);
        int arr2[]=arr;
        System.out.println(arr2);
        int[] arr3= Arrays.copyOf(arr,arr.length);
        int[] arr4 = arr.clone();

//        int arr2[][] = {{2,5},{6,7}};

//        for(int i = 0; i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int j: arr) {
//            System.out.println("this is second Array "+j);
//        }
//        int k =0;
//        while (k<arr.length){
//            System.out.println("this is third Array"+arr[k]);
//            k++;
//        }
//        for (int i = 0;i< arr2.length;i++){
//            for(int j= 0;j< arr2.length;j++){
//                System.out.println(arr2[i][j]);
//            }
//        }
//        int big=0;
//        for(int i =0; i< arr.length;i++){
//            if(big<arr[i]){
//                big=arr[i];
//            }
//        }
//        System.out.println(big);

//        int value=5;
//        for(int i =0; i< arr.length;i++){
//            if(value==arr[i]){
//                System.out.println("Yes give value present in this array at index" +i);
//                break;
//            }
//        }
//        System.out.println(big);

    }
}
