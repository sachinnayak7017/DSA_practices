package String;

import java.util.Arrays;

public class String_09_09_StringMostFrequent {
    static void main() {
       String s = "testsample";
        System.out.println(getMaxOccuringChar(s));

    }
    public static char getMaxOccuringChar1(String s) {

        int max = 0;
        char ans = Character.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > max) {
                max = count;
                ans = ch;
            } else if (count == max && ch < ans) {
                ans = ch;
            }
        }

        return ans;
    }
    public static char getMaxOccuringChar(String s) {

        int max = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i =0, j =0;
        while(j<s.length()){

            if (arr[i]== arr[j]) j++;
            else {
                int freq = j-i;
                if(freq>max){
                    max = freq;
                    ans = arr[i];
                }
                i=j;
            }
        }
        int freq = j-i;
        if(freq>max){
            max = freq;
            ans = arr[i];
        }
        i=j;
        return ans;
    }
}
