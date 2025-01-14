package applleCodeSingnal;
/*You are provided with a string of n lowercase English alphabet letters (from 'a' to 'z'),
where n ranges from 1 to 100, inclusive.
You must create a new string by selecting characters from the given string in a specific order:
 select each character that comes k characters after the previous selection in the string. If you reach the end of the string, you should continue from the beginning.

Write a Java function, public String repeatCharJump(String inputString, int step).
The function takes two parameters: inputString and step, where inputString is the string you are working with,
and step is an integer that denotes the number of characters to skip with each jump.
The value of step ranges from 1 to the length of the input string.
The function should return a newly formed string consisting of characters selected in the order dictated by the jump length step.

For example, if inputString is "abcdefg" and step is 3,
 the function should return "adgcfbe". This is because after 'a', comes 'd' (3 characters after 'a'),
 followed by 'g' (3 characters after 'd', circling back to the start of the string after 'g'), and so on.

Note: You should continue jumping from the start of the string when you reach the end.

For this task, assume that you need not use a character more than once.
When you have traversed all the characters at least once,
you can stop and return the output string as it is. It is guaranteed,
 that the inputs will be given in a way, that following the traversal pattern,
 you'll traverse all the characters.*/

public class CharJump {

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println("Given String "+ str);
        int step = 3;

        System.out.println( "Output: "+repeatCharJump(str, step));
    }

    private static String repeatCharJump(String str, int step) {
        int n = str.length();
        int currentIndex = 0;
        int visitedCount = 0;

        boolean [] visited = new boolean[n];

        StringBuilder result = new StringBuilder();
        while(visitedCount < n){

            if(!visited[currentIndex]){
                result.append(str.charAt(currentIndex));
                visited[currentIndex] = true;
                visitedCount++;

            }
            currentIndex = (currentIndex+step)%n;
        }
        return result.toString();
    }
}
