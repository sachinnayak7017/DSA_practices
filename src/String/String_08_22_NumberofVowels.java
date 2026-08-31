package String;

public class String_08_22_NumberofVowels {
    static void main() {
        String s1 = "sachin nayak";
        int count =0;
        for(int j = 0; j<s1.length();j++){
            if(s1.charAt(j)=='a' || s1.charAt(j)=='e' ||s1.charAt(j)=='o'||s1.charAt(j)=='i'|| s1.charAt(j)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
