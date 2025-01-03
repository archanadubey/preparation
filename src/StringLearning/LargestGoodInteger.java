package StringLearning;

import java.util.Stack;

public class LargestGoodInteger {

    private static String findLargestGoodInteger(String num) {

        String largest = ""; // Initialize to an empty string

        for (int i = 0; i <= num.length() - 3; i++) {
            String substring = num.substring(i, i + 3); // Extract a substring of length 3

            if (substring.charAt(0) == substring.charAt(1) && substring.charAt(1) == substring.charAt(2)) {
                // Check if all three characters are the same
                if (largest.isEmpty() || substring.compareTo(largest) > 0) {
                    largest = substring; // Update the largest good integer
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        System.out.println(findLargestGoodInteger("1233331"));
       // System.out.println(findLargestGoodInteger("12"));
        System.out.println(findLargestGoodInteger("13000654"));
        String s1 = "leetcode";
        System.out.println(findLexicographicallySmallestString(s1));

    }

    private static String findLexicographicallySmallestString(String sequence) {
        int n = sequence.length(); // Length of the input sequence
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n + 1; i++) {
            // Push the current number onto the stack
            stack.push(i);

            // Process the stack when we're at the last number or when sequence[i - 1] == 'A'
            if (i == n + 1 || (i <= n && sequence.charAt(i - 1) == 'A')) {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }


}
