package applleCodeSingnal;

import java.util.ArrayList;
import java.util.Arrays;

/*You are given an input array consisting of n integers ranging from 0 to 100, inclusive,
where n represents the length of the array.
Your task is to write a function that returns a new array of strings.
 Each string should consist of two elements joined by a space:
  an element from the input array paired with its geometric mean with the 'opposite' element.
  The 'opposite' element of any element in the array is defined as the element at the
   corresponding position from the end of the array.

Assume that the geometric mean of two numbers, a and b, is calculated as:
a
⋅
b
a⋅b */
public class OppositeElementsMean {
    public static void main(String[] args) {
        ArrayList<Integer> num = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        solution(num);
        ArrayList<String> result = solution(num);
        System.out.println(result);
    }

    private static ArrayList<String> solution(ArrayList<Integer> numbers) {
        // length of the list
        int n = numbers.size();
        int index ;
        double mean;
        // create a new ArrayList and add the mean pair to return
        ArrayList<String> result = new ArrayList<>();

        // Iterate over the list given
        for (index = 0; index<numbers.size(); index++){
            //get the fist elements
            int first = numbers.get(index);
            int last = numbers.get(n - index -1);

            mean = Math.sqrt(first*last);

            result.add(first+" "+String.format("%.2f",mean));


        }

            return result;

    }
}
