package StringLearning;

import java.util.Stack;

public class ValidParanthesisUsingStack {

    public static boolean validParanthesis(String s){

    Stack<Character> stack = new Stack<>();
    // convert String s to char Arrqy
        char [] sChar = s.toCharArray();

        for (char x : sChar){
            if(x == '('){
               stack.push(')');
            }else if(x == '{'){
                stack.push('}');

            } else if (x == '[') {

                stack.push(']');

            } else if (stack.isEmpty()|| stack.pop() !=x) {

                return false;
                
            }
        }

    return stack.isEmpty();

    }


    public static void main(String[] args) {

        String str = "(){}[]{";
        System.out.println(validParanthesis(str));
    }
}