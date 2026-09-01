package String;

import java.util.Scanner;

public class String_09_01_CountDigits {
    static void main() {

        Scanner sc   = new Scanner(System.in);
         int n = sc.nextInt();
        // String s = Integer.toString(n);
        String s = ""+n;
         System.out.println(s.length());

         String str = "0002938402";
         int k = Integer.parseInt(str);
        System.out.println(k);

    }


}
