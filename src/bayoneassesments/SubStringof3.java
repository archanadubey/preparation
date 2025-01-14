package bayoneassesments;

public class SubStringof3 {

    public static void main(String[] args) {


        System.out.println("hellow");
        String num = "34000210";
        System.out.println(uniqueSubStringofNum(num));
    }

    public static String uniqueSubStringofNum(String num) {
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
}