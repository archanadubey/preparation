package Hrank;
/*Louise joined a social networking site to stay in touch with her friends.
 The signup page required her to input a name and a password. However, the password must be strong.
 The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong.
 Given the string she typed, can you find the minimum number of characters
  she must add to make her password strong?
        numbers = "0123456789"
        lower_case = "abcdefghijklmnopqrstuvwxyz"
        upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        special_characters = "!@#$%^&*()-+"*/

import java.util.Scanner;

public class StrongPassword {

    public static void main(String[] args) {
         System.out.println("Enter Password");
        Scanner sc = new Scanner(System.in);
       String input =  sc.nextLine();
       int len = input.length();

       enteredPassword(len ,input);


    }

    public static int  enteredPassword(int len, String password) {

//        int  numbers = "0123456789";
//        String lower_case = "abcdefghijklmnopqrstuvwxyz";
//        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String special_characters = "!@#$%^&*()-+"*/;
return 0;

    }


}
