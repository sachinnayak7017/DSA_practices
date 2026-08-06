package array;

import java.util.Arrays;

public class Array_1D_08_05_Sagarigate0and1 {

    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0,0,0};
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while(start < end){

            if(arr[start]==0) start ++;
            if(arr[end]==1) end --;
            if(start>end) break;;
            if(arr[start]==1 && arr[end]==0){

            arr[start ]=0;
            arr[end] = 1;
            start++;
            end--;
        }
    }
}}