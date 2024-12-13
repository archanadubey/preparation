package StringLearning;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String commonPrefix(String [] str){

        StringBuilder sb = new StringBuilder();

        // Sort the String. It's a void it will not return anything

        Arrays.sort(str);
        // Change into character Array
        char [] start = str[0].toCharArray();//.toLowerCase();
        char [] end = str[str.length-1].toCharArray();//.toLowercase();

            for(int i = 0; i<str.length;i++){
                if(start[i] != end[i]){
                    break;
                }else
               sb.append(start[i]);
            }

    return sb.toString();

    }

        public static void main(String[] args) {

       String [] s ={"class","clue","clove"};
           // String s = "clove";

        System.out.println(commonPrefix(s));

    }
}
