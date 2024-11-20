package StringLearning;

import java.util.HashMap;
import java.util.Map;

public class ShortestUniqueSubstring {
    public static int solution(String S) {
        int shortestLength = Integer.MAX_VALUE;
        // Create a map to store the frequency of each substring
        Map<String, Integer> substringFrequency = new HashMap<>();
        // Iterate through each substring of S
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                String substring = S.substring(i, j);
                // Update the frequency of the current substring
                substringFrequency.put(substring, substringFrequency.getOrDefault(substring, 0) + 1);
            }
        }
        // Iterate through the substrings and find the shortest unique substring
        for (Map.Entry<String, Integer> entry : substringFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                shortestLength = Math.min(shortestLength, entry.getKey().length());
            }
        }
        return shortestLength;
    }
    public static void main(String[] args) {
        String[] testCases = {"abaaba"};
        // "zyzyzyz", "aabbbabaaa"
        for (String testCase : testCases) {
            System.out.println("Shortest unique substring length for " + testCase + ": " + solution(testCase));
        }
    }
}
