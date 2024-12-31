package recursion;

import java.util.HashMap;


public class MethematicalInterpretation {
    //Implement a program to calculate a^b (a to the power b)
   // Implements the program to print n natural number
   // Implements the program to print sum of  n natural number
    public static void main(String[] args) {
        int [] nums = {2,11,15,7};
        int target = 9;

       int [] result = twoSum(nums, target);
        System.out.println(result);
    }

public static int [] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            map.put(nums[i], i);

        }

        for(int i=0 ; i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};


            }

        }


return new int[0];

}

}

