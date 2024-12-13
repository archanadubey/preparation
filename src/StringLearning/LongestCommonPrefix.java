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

    private static String CommonPrefixUsingString(String []strs) {

        // Sort the String Arrays

        Arrays.sort(strs);

        String start = strs[0];//class
        String end = strs[strs.length-1];//clue
        int index = 0;

        while (index<strs.length){

            if(start.charAt(index) == end.charAt(index)) {

                index++;
            }else
                break;
        }
           return start.substring(0,index);



    }



    public static String removeConsecutiveCharacter(String S){


        StringBuilder ab = new StringBuilder();
        ;            for(int i=0; i< S.length()-1;i++) {
            if(S.charAt(i) != S.charAt(i+1)){
                ab.append(S.charAt(i));
            }

        }
        ab.append(S.charAt(S.length()-1));
       return ab.toString();

    }

        public static void main(String[] args) {
            String S = "aabb";
            String [] s ={"class","clue","clove"};
            String [] string = {"flower","flow","flight"};
            String [] string1 = {"a"};

            System.out.println(commonPrefix(s));
            System.out.println(CommonPrefixUsingString(string));
            System.out.println(CommonPrefixUsingString(string1));
            System.out.println("Removed Consecutive Character; "+removeConsecutiveCharacter(S));

    }


}
