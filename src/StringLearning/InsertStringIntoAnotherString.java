package StringLearning;

public class InsertStringIntoAnotherString {

    public static void main(String[] args) {

        String originalString = "KidsLoveSoccers";
        String toBeInserted = "tooMuch";
        int index = 3;

        insertString(originalString,toBeInserted,index);

    }

    private static void insertString(String originalString, String toBeInserted, int index) {

        //create a new String
        String str = new String();

        // Insert the original string character into the new string
        for (int i=0; i<originalString.length();i++){

            str += originalString.charAt(i);
            if (i==index){
                str += toBeInserted;
                //return str;


            }



        }
        System.out.println(str);
    }
}
