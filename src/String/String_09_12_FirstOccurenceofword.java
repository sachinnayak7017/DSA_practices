package String;

public class String_09_12_FirstOccurenceofword {
    static void main() {

        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
         int idx =-1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
               if(haystack.substring(i,needle.length()+i).equals(needle)){
                   return i;
               }
            }
        }

        return idx;
    }
    }
