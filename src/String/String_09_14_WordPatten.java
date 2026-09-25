//package String;
//
//import java.util.HashMap;
//
//public class String_09_14_WordPatten {
//    static void main() {
//
//
//        String s =  "dog cat cat dog";
//        String pattern ="abba";
//
//        char[] charr = pattern.toCharArray();
//        String[] str = s.trim().split(" ");
//        if(pattern.length()!= str.length){
//           return false;
//        }
//        HashMap<Character, String> hash = new HashMap<Character, String>();
//        for(int i =0; i< pattern.length();i++){
//           char ch = charr[i];
//
//
//           boolean containskey = hash.containsKey(ch);
//           if(hash.containsValue(str[i]) && !containskey){
//               return false;
//           }
//           if(containskey && !hash.get(ch).equals(str[i])){
//               return false;
//           }
//           else{
//               hash.put(ch, str[i]);
//           }
//        }  return true;
//
//
//    }
//}
