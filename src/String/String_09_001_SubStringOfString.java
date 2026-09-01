package String;

import java.util.Scanner;

public class String_09_001_SubStringOfString {
    static void main() {
        String a = "abc";
        String s = "Jaishanker";
        String s1 = "12345";
        System.out.println(s.substring(0,2));
//        for(int i =0; i< s.length();i++){
//            for(int j =i; j<s.length();j++){
//                System.out.print(s.substring(i,j) + " ");
//            }
//            System.out.println(" ");
//        }
        System.out.println(sumSubstrings(s1));
    }
    public static int sumSubstrings(String s) {
        // code here
        int sum = 0;
        for(int i =0; i< s.length();i++){
            for(int j =i+1; j<=s.length();j++){
                String s1 = s.substring(i,j);
                int a = Integer.parseInt(s1);
                System.out.println(a);
               // sum = sum + a;
            }

        }
        return sum;
    }


}
