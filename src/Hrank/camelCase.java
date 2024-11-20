package Hrank;

import java.util.Scanner;

/*'camelcase' function
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */
public class camelCase {
    public static void main(String[] args) {
        System.out.println("Enter the String to count the number od words");

        // take input from the user

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

       int numberOfWords= worldCount(input);
        System.out.println("Number of Worlds: "+numberOfWords);
    }

    public static int worldCount(String str){

        int count =1;
        for (int i =0; i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
               count ++;
            }
        }
        return count;

    }
}