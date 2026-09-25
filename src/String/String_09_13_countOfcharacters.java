package String;

public class String_09_13_countOfcharacters {
    static void main() {

        String s = " the sky is blue ";


        System.out.println(countcharacters(s));
    }

    public static int countcharacters(String s) {
        s = s.trim();
int count =0;
        for (int i = 0; i <= s.length()-1; i++) {
            if(s.charAt(i)!=' '){
                count ++;
            }

        }

        return count;
    }
}