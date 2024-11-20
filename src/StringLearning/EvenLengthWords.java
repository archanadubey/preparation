package StringLearning;
//Given a string s, write a Java program to print all words with even length in the given string.
// input string = "I am geeks for geek";
// output: am
//        geek

public class EvenLengthWords {


    public static void evenLength(String s){

        for( String sl : s.split(" ")){
            if(sl.length()%2 == 0){
                System.out.println(sl);
            }


        }

    }






    public static void main(String[] args) {


        String str = "I am a geeks fore geek";
        evenLength(str);


    }

}
// time Complexcity is O(n):  W