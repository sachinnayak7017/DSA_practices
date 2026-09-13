package String;

import java.util.Arrays;

public class String_09_10_StringBasics {
    static void main() {
        String firstName  = "sachin";
        String firstName1  = "sachin";
        String str = " ";
//        if(firstName == firstName1){ by reference
//            System.out.println("both String are equal");
//        }else{
//            System.out.println("both String are not equal");
//        }
//        if(firstName.equals(firstName1)){//case sensitive letter by letter
//            System.out.println("both String are equal");
//        }else{
//            System.out.println("both String are not equal");
//        }
        String lastName = new String("nayak");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(3));
//        System.out.println(str.length());
//        System.out.println(str.isBlank());//if empty and only space count like blank
//        System.out.println(str.isEmpty());//if empty not any space if have space then count in string

        String name = "    sachinNAYAk  ";
        name = name.trim();
//        System.out.println(name.length());//trim space start and end
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());

//          String std= "My name is sachin kumar";
//        System.out.println(std.substring( 3 , 6));
//        System.out.println(std.contains("sachin"));
//
//        int num = 38274;
//        String strnum = String.valueOf(num);
//        System.out.println(strnum+1);

        String name1 = "sachin nayak kumar pawar";
        System.out.println(name1.startsWith("sachin nayak"));
//        System.out.println(name1.endsWith("pawar"));

//        String str3 = "my,name,is,sachin,kumar";
//        String[] words = str3.split(",");
//        for(String st : words){
//            System.out.println(st);
//        }

//        String name5 = "sachinnnnayak vipul";
//      name5=  name5.replace('n','p');
//        System.out.println(name5);

    }

}
