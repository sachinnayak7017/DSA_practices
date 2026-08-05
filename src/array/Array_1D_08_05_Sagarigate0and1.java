package array;

import java.util.Arrays;

public class Array_1D_08_05_Sagarigate0and1 {

    public static void main(String[] args) {

        int[] arr = {1,0,1,0,1,0,0,0};

         int zero = 0;
        int one =0;
        for(int ar : arr){
            if(ar==0) zero++;
            else one ++;
        }
        for(int i =0; i < arr.length; i++){
            if(i<zero) arr[i]=0;
            else arr[i]=1;
        }

    }
}