package applleCodeSingnal;
/*In this task, you are given a string s,
and your goal is to produce a new string following a specific pattern.
You are to take characters in sets of three, reverse the characters in each set,
 and then place them back into the string in their original positions,
  preserving the reverse order within each set.
  If 1 or 2 characters remain at the end (because the length of the string is not divisible by 3),
  they should be left as they are.

 The string s contains only lowercase English letters,
 with its length ranging from 1 to 300, inclusive.

For example, if you are given the input 'abcdef', the output should be 'cbafed'.
 For the input 'abcdefg', your function should provide 'cbafedg'.*/


public class ReverseTripalChar {

    public static void main(String[] args) {
        String s = "abcdef";
        String s2 = "abcdefg";
        System.out.println("Given String : "+s);

        String rev = reverseTripal(s);
        System.out.println(rev);
    }

    private static String reverseTripal(String s) {
        int n = s.length();

        StringBuilder result = new StringBuilder();
        // create a loop which goen till the end and jump by 3 to get the group of triple char

        for(int i = 0; i<n; i+=3){

            // get the string of length 3

          // Using Math.min(currentIndex + step, n) ensures that we only go up to the end of the string (n),
            // preventing an IndexOutOfBoundsException.
            String length3String = s.substring(i,Math.min(i+3,n));
           // Now, we got the String of length 3, lets check
            if(length3String.length() == 3){
                //convert it to String builder to reverse the String length3String;
                length3String = new StringBuilder(length3String).reverse().toString();
            }
            result.append(length3String);
        }
        return result.toString();
    }
}
