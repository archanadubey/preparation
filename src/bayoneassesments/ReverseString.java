package bayoneassesments;
// reverse the string and convert it to the upper case
public class ReverseString {

    public static void main(String[] args) {
        String str = "coding";
        String toReverse = "builder";

        System.out.println(reverse(str));
        System.out.println(reverse("Archana"));
        System.out.println(reverseStringUsingStringBuilder(toReverse));
        System.out.println(reverseStringUsingStringBuilder("abc"));

    }

    public static String reverse(String str){

        String rev = "";
        for(int i = str.length()-1; i>0; i--){
            rev = rev + str.charAt(i);
        }

        return rev.toUpperCase();
    }

    //using StringBuilder method

    public static String reverseStringUsingStringBuilder(String str){

         StringBuilder reversed = new StringBuilder(str).reverse();

            return reversed.toString().toUpperCase();

    }

}
