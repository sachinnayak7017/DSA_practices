package array2D;

import java.util.Scanner;

public class FirstMultidimensionalArray {
    public static void main(String[] args){


     int[][] arr1 = new int[3][4];
     int[][] arr = {{1,2,3},{2,3,4},{3,4,5},{5,6,7}};
     Scanner  sc = new Scanner(System.in);
//        System.out.println("enter value :");
//        for(int i =0; i< 3;i++){
//            for (int j =0; j< 4;j++){
//                arr[i][j]= sc.nextInt();
//            }
//        }
        for(int i =0; i< arr.length;i++){
            for (int j =0; j< arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
