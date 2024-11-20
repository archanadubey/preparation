package StringLearning;

public class StringFunctionsDemo {

    public static int countCommonBaseString(String str1, String str2){

        int count = 0;

        for(int i = 0; i< str1.length();i++){
            for(int j = i+1; j<str1.length();j++){
                String newString = str1.substring(i,j);

                if (str2.contains(newString))
                    count++;

            }

        }
        return count;
    }






}
