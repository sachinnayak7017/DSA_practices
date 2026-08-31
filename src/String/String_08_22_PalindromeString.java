package String;

public class String_08_22_PalindromeString {

        static void main() {
            String s1 = "asdfgfdsa";
            System.out.println(revese(s1));
        }

        static boolean revese(String s){
            // code here
            int i =0; int j = s.length()-1;
            while(i<j) {
                if (s.charAt(i) != s.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
        }

    }

