package StringLearning;

public class ValidParanthesis {

    public  boolean isValidParanthesis(String s){

        // get the length of s

      int   length;
      do {

          length = s.length();
          s = s.replace("()", "").replace("{}", "").replace("[]", "");


      }

        while ( length != s.length());

//            if (s.isEmpty()){
//
//                return true;
//            }
//        return false;

            return s.length() == 0;
        }


    public static void main(String[] args) {

        String str = "({[]})]";

        ValidParanthesis vp = new ValidParanthesis();
      boolean result =  vp.isValidParanthesis(str);
        System.out.println(result);

     //   boolean validParanthesis = isValidParanthesis(str);


    }

}
//}