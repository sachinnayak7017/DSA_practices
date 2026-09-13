package String;

import java.util.ArrayList;

public class String_09_07_StringBuilders {
    static void main() {
        //ArrayList<Character> str = new ArrayList<>();
      StringBuilder s = new StringBuilder("Saphin");
        System.out.println(s.length()+ " "+ s.capacity());
        s.append("nayak");
        System.out.println(s);
        System.out.println(s.length()+ " "+ s.capacity());
        s.setCharAt(2, 'c');
        System.out.println(s);
        s.replace(1,5,"k");
        System.out.println(s);
        StringBuilder sb = new StringBuilder("Saphin");
        int i =0, j =sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

    }


}
