package StringLearning;
// count the string of the world
public class Count {

    public static void main(String[] args) {

        String world = "Wish you a very happy Diwali";

        String [] Words = world.split("\s+");

        // to count the words in the array

        int wordCount = Words.length;

        System.out.println("Total world Count : "+ wordCount);

        // to print the all words

        System.out.println("The worlds are : ");

        for(String w : Words){

            System.out.println(w);

        }
    }
}
