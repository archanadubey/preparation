package ArraysExercise;

public class MaximumSubarraySum {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int n = array.length;
        // Print All the possible sub Array

       // using Bruth Force Approch

        for(int st = 0; st<n ; st++){
            for(int end =st; end<n; end++){

                for(int i =st; i<=end; i++){
                    System.out.print(array[i]);
                }
                System.out.println(" ");
            }

        }


    }
}
