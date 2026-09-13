package String;

public class String_09_12_Lengthoflastword {
    static void main() {

        String name = "  sachin nayak kumar pawar   ";
        System.out.println(lengthOfLastWord(name));
       int a =  name.indexOf("nayak");
        System.out.println(a);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        System.out.println(s);
        String[] arr = s.split(" ");
        int count = arr[arr.length-1].length();
        return count;
    }
}
