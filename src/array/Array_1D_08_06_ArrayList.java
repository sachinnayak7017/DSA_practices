package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Array_1D_08_06_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(5);
        arr.add(2);
        arr.add(34);
        arr.add(12);
//        System.out.println(arr.get(2));
//        arr.set(2,8);
//        System.out.println(arr.get(2));
//        System.out.println(arr.size());
//
//        Collections.reverse(arr);
//        System.out.println(arr);
         int  i =0;
         int j = arr.size()-1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}