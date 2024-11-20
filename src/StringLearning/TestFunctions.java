package StringLearning;

import static StringLearning.StringFunctionsDemo.countCommonBaseString;

public class TestFunctions {


    public static void main(String arg[]){
        String str1 = "ABCD";
        String str2 = "ABEF";

        int count = countCommonBaseString(str1,str2);
        System.out.println(count);

    }
}
